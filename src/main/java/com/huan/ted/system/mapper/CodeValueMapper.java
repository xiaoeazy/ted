/*
 * #{copyright}#
 */

package com.huan.ted.system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huan.ted.mybatis.common.Mapper;
import com.huan.ted.system.dto.CodeValue;

/**
 * @author huanghuan
 */
public interface CodeValueMapper extends Mapper<CodeValue> {

    int deleteByCodeId(CodeValue key);

    int deleteTlByCodeId(CodeValue key);

    List<CodeValue> selectCodeValuesByCodeName(String codeName);

    List<CodeValue> queryMsgTemCodeLov(@Param("value") String value, @Param("meaning") String meaning);
    
    List<CodeValue> queryEmlAccountCodeLov(@Param("value") String value, @Param("meaning") String meaning);
}