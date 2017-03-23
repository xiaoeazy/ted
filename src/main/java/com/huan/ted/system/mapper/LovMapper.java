/*
 * #{copyright}#
 */
package com.huan.ted.system.mapper;

import com.huan.ted.mybatis.common.Mapper;
import com.huan.ted.system.dto.Lov;

/**
 * 
 * @author huanghuan
 *
 * 2016年2月1日
 */
public interface LovMapper extends Mapper<Lov> {

    Lov selectByCode(String code);

}