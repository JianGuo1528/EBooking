package com.ustrip.service;

import com.ustrip.entity.Dict;

import java.util.List;

public interface DictService {
    Dict selectByPrimaryKey(Integer id);

    Integer updateByPrimaryKey(Dict dict);

    List<Dict> selectAllTypeByHotelId(String type, Integer hotelId, Boolean... onlySpecificHotel);

    Dict selectTypeByHotelIdAndId(Integer id, Integer hotelID);

    Integer updateDictByHotelIdAndId(Dict dict, Integer id, Integer hotelID);

    Integer insertType(Dict dict);
}
