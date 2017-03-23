/*
 * #{copyright}#
 */
package com.huan.ted.system.mapper;

import java.util.List;

import com.huan.ted.mybatis.common.Mapper;
import com.huan.ted.system.dto.LovItem;

/**
 * 
 * @author huanghuan
 *
 *         2016年2月1日
 */
public interface LovItemMapper extends Mapper<LovItem> {

    List<LovItem> selectByLovId(Long lovId);

    int deleteByLovId(Long lovId);
}