/*
 * #{copyright}#
 */
package com.huan.ted.function.service.impl;

import java.util.List;

import com.huan.ted.cache.impl.RoleFunctionCache;
import com.huan.ted.function.dto.RoleFunction;
import com.huan.ted.function.service.IRoleFunctionService;
import com.huan.ted.system.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.huan.ted.cache.impl.RoleResourceCache;
import com.huan.ted.core.IRequest;
import com.huan.ted.function.mapper.RoleFunctionMapper;

/**
 * @author huanghuan
 * @author huanghuan
 */
@Transactional
@Service
public class RoleFunctionServiceImpl extends BaseServiceImpl<RoleFunction> implements IRoleFunctionService {

    @Autowired
    private RoleFunctionMapper rolefunctionMapper;

    @Autowired
    private RoleFunctionCache roleFunctionCache;

    @Autowired
    private RoleResourceCache roleResourceCache;

    @Transactional(propagation = Propagation.SUPPORTS)
    public Long[] getRoleFunctionById(Long roleId) {
        // TODO:需要考虑缓存没有的情况
        return roleFunctionCache.getValue(roleId.toString());
    }

    @Override
    public List<RoleFunction> batchUpdate(IRequest requestContext, List<RoleFunction> roleFunctions) {
        if (roleFunctions != null && !roleFunctions.isEmpty()) {
            RoleFunction rf = roleFunctions.get(0);
            Long[] ids = new Long[roleFunctions.size()];
            Long roleId = rf.getRoleId();
            int i = 0;
            rolefunctionMapper.deleteByRoleId(roleId);
            for (RoleFunction rolefunction : roleFunctions) {
                rolefunctionMapper.insertSelective(rolefunction);
                ids[i++] = rolefunction.getFunctionId();
            }
            clearRoleFunctionCacheByRoleId(roleId);
            roleFunctionCache.setValue(roleId.toString(), ids);
            self().reloadRoleResourceCache(roleId);
        }
        return roleFunctions;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public void clearRoleFunctionByRoleId(Long roleId) {
        rolefunctionMapper.deleteByRoleId(roleId);
        clearRoleFunctionCacheByRoleId(roleId);
    }

    private void clearRoleFunctionCacheByRoleId(Long roleId) {
        roleFunctionCache.remove(roleId.toString());
        roleResourceCache.remove(roleId.toString());
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public void reloadRoleResourceCache(Long roleId) {
        roleResourceCache.remove(roleId.toString());
        roleResourceCache.loadRoleResource(roleId);

    }
}
