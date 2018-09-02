package com.ustrip.impl;

import com.ustrip.dao.OperationDao;
import com.ustrip.entity.Operation;
import com.ustrip.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements OperationService {
    @Autowired
    private OperationDao operationDao;

    @Override
    public Integer insertOperation(Operation operation) {
        return operationDao.insertSelective(operation);
    }
}
