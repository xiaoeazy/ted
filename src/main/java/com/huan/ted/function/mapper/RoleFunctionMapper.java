/*
 * #{copyright}#
 */

package com.huan.ted.function.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.huan.ted.function.dto.RoleFunction;
import com.huan.ted.mybatis.common.Mapper;

/**
 * 角色功能mapper.
 * 
 * @author huanghuan
 */
public interface RoleFunctionMapper extends Mapper<RoleFunction> {

    List<RoleFunction> selectRoleFunctions(RoleFunction record);

    List<Map<String, Object>> selectAllRoleResources();

    int deleteByFunctionId(Long functionId);

    int deleteByRoleId(Long roleId);

    int selectCountByFunctionCode(@Param("roleId") Long roleId, @Param("functionCode") String functionCode);
}