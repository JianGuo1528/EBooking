package com.ustrip.impl;

import com.ustrip.common.UsiTripConstant;
import com.ustrip.dao.DictDao;
import com.ustrip.entity.Dict;
import com.ustrip.entity.DictExample;
import com.ustrip.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictServiceImpl implements DictService {
    @Autowired
    private DictDao dictDao;

    @Override
    public Dict selectByPrimaryKey(Integer id) {
        return dictDao.selectByPrimaryKey(id);
    }

    @Override
    public Integer updateByPrimaryKey(Dict dict) {
        return dictDao.updateByPrimaryKey(dict);
    }

    @Override
    public List<Dict> selectAllTypeByHotelId(String type, Integer hotelId, Boolean... onlySpecificHotel) {
        DictExample dictExample = new DictExample();
        if (hotelId > 0) {
            dictExample.createCriteria().andTypeEqualTo(type).andHotelIdEqualTo(hotelId);
            if (onlySpecificHotel.length == 0 || !onlySpecificHotel[0]) {
                dictExample.or().andTypeEqualTo(type).andHotelIdEqualTo(0);
            }
        } else if (hotelId == 0) {
            dictExample.createCriteria().andTypeEqualTo(type).andHotelIdEqualTo(0);
        }
        dictExample.setOrderByClause(UsiTripConstant.DICTORDERFIELD);
        return dictDao.selectByExample(dictExample);
    }

    @Override
    public Dict selectTypeByHotelIdAndId(Integer id, Integer hotelID) {
        DictExample dictExample = new DictExample();
        dictExample.createCriteria().andIdEqualTo(id).andHotelIdEqualTo(hotelID);
        List<Dict> dicts = dictDao.selectByExample(dictExample);
        return dicts == null || dicts.size() == 0 ? null : dicts.get(0);
    }

    @Override
    public Integer updateDictByHotelIdAndId(Dict dict, Integer id, Integer hotelID) {
        DictExample dictExample = new DictExample();
        dictExample.createCriteria().andIdEqualTo(id).andHotelIdEqualTo(hotelID);
        return dictDao.updateByExampleSelective(dict, dictExample);
    }

    @Override
    public Integer insertType(Dict dict) {
        DictExample dictExample = new DictExample();
        DictExample.Criteria criteria = dictExample.createCriteria();
        String typeName = dict.getTypeName();
        if (typeName != null && !typeName.isEmpty()) {
            criteria.andTypeNameEqualTo(typeName);
        }
        String type = dict.getType();
        if (type != null && !type.isEmpty()) {
            criteria.andTypeEqualTo(type);
        }
        criteria.andHotelIdEqualTo(0);

        Integer hotelId = dict.getHotelId();
        if (hotelId != null && hotelId != 0) {
            DictExample.Criteria or = dictExample.or();
            if (typeName != null && !typeName.isEmpty()) {
                or.andTypeNameEqualTo(typeName);
            }
            if (type != null && !type.isEmpty()) {
                or.andTypeEqualTo(type);
            }
            or.andHotelIdEqualTo(hotelId);
        }
        List<Dict> dicts = dictDao.selectByExample(dictExample);
        if (dicts == null || dicts.size() == 0) {
            dictDao.insertSelective(dict);
            return dict.getId();
        }else {
            return 0;
        }
    }
}
