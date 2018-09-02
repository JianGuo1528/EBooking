package com.ustrip.dao;

import org.apache.ibatis.annotations.Param;

import javax.annotation.security.PermitAll;
import java.util.List;
import java.util.Map;

public interface AliWorldCityDao {
    Map<String, Object> selectWorldCityByCountryName(@Param("countryNameZh") String countryNameZh);

    List<Map<String, Object>> selectAliCityByCondition(@Param("countryCode") String countryCode, @Param("latitude") String latitude, @Param("longitude") String longitude);

    void insertData2AliCity(Map<String, Object> paramMap);

    List<String> selectHotelByCityCode(@Param("cityCode") String cityCode);
}
