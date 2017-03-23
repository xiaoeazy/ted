package com.huan.ted.system.mapper;

import java.util.List;

import com.huan.ted.mybatis.common.Mapper;
import com.huan.ted.system.dto.UserDashboard;

public interface UserDashboardMapper extends Mapper<UserDashboard> {
    
    List<UserDashboard>  selectMyDashboardConfig();
}
