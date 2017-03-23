/*
 * #{copyright}#
 */

package com.huan.ted.system.mapper;

import com.huan.ted.mybatis.common.Mapper;
import com.huan.ted.system.dto.Profile;

/**
 * @author huanghuan
 */
public interface ProfileMapper extends Mapper<Profile> {

    Profile selectByName(String profileName);
}