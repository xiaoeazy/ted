/*
 * #{copyright}#
 */
package com.huan.ted.system.mapper;

import com.huan.ted.mybatis.common.Mapper;
import com.huan.ted.system.dto.SysPreferences;

/**
 * 系统首选项Mapper.
 * 
 * @author huanghuan
 */
public interface SysPreferencesMapper extends Mapper<SysPreferences> {

    SysPreferences selectUserPreference(SysPreferences record);

    int updatePreferLine(SysPreferences record);
}