package com.huan.ted.system.mapper;

import java.util.List;

import com.huan.ted.mybatis.common.Mapper;
import com.huan.ted.system.dto.DashBoard;

/**
 * 
 * @author huanghuan
 */
public interface DashBoardMapper extends Mapper<DashBoard> {

    List<DashBoard> selectDashBoards(DashBoard dashBoard);

}
