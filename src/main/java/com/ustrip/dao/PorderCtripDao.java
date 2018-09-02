package com.ustrip.dao;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface PorderCtripDao {
    Map<String,Object> selectPorderCtripByCtripReservationNo(@Param("ctripReservationNo") String ctripReservationNo);

    Integer insertData2PorderCtrip(Map<String, String> paramMap);

	int updateStatusOfPorderCtrip(Map<String, Object> paramMap);

	Map<String, Object> selectPorderCtripByCtripReservationNoAllStatus(String ctripReservationNo);
}
