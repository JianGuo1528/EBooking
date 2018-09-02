package com.ustrip.impl;

import com.ustrip.common.UsiTripConstant;
import com.ustrip.dao.UserDao;
import com.ustrip.entity.User;
import com.ustrip.entity.UserExample;
import com.ustrip.service.UserService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User selectUserByUsernameAndPwd(String username, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(username).andPasswordEqualTo(password).andStatusEqualTo(1);
        List<User> users = userDao.selectByExample(userExample);
        return users == null || users.size() == 0 ? null : users.get(0);
    }

    @Override
    public Integer deleteUserByUsernameAndPwd(String username, String apiPassword) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(username).andApiPasswordEqualTo(apiPassword);
        List<User> users = userDao.selectByExample(userExample);
        if (users == null || users.size() == 0) {
            return 0;
        }
        User user = users.get(0);
        user.setStatus(0);

        userExample.clear();
        userExample.createCriteria().andUserIdEqualTo(user.getUserId());
        return userDao.updateByExample(user, userExample);
    }

    @Override
    public Integer updateUserById(User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserIdEqualTo(user.getUserId());
        return userDao.updateByExampleSelective(user, userExample);
    }

    @Override
    public Integer updateUserByUsername(User user, String oldUsername) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(oldUsername);
        return userDao.updateByExampleSelective(user, userExample);
    }

    @Override
    public User selectUserByUsernameAndApiPwd(String username, String apiPassword) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(username).andApiPasswordEqualTo(apiPassword).andStatusEqualTo(1);
        List<User> users = userDao.selectByExample(userExample);
        return users == null || users.size() == 0 ? null : users.get(0);
    }

    @Override
    public User selectUserById(Integer userId) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserIdEqualTo(userId).andStatusEqualTo(1);
        List<User> users = userDao.selectByExample(userExample);
        return users == null || users.size() == 0 ? null : users.get(0);
    }

    @Override
    public List<User> selectUserByCondition(JSONObject conditionData) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria().andStatusEqualTo(1);

        if (conditionData.has("hotelChain")) {
            String hotelChain = (String) conditionData.get("hotelChain");
            if (hotelChain != null && !hotelChain.trim().isEmpty()) {
                criteria.andHotelChainLike("%" + hotelChain + "%");
            }
        }
        if (conditionData.has("username")) {
            String username = (String) conditionData.get("username");
            if (username != null && !username.trim().isEmpty()) {
                criteria.andUserNameLike("%" + username + "%");
            }
        }
        if (conditionData.has("name")) {
            String name = (String) conditionData.get("name");
            if (name != null && !name.trim().isEmpty()) {
                criteria.andNameLike("%" + name + "%");
            }
        }
        if (conditionData.has("cellPhone")) {
            String cellPhone = (String) conditionData.get("cellPhone");
            if (cellPhone != null && !cellPhone.trim().isEmpty()) {
                criteria.andCellPhoneLike("%" + cellPhone + "%");
            }
        }
        userExample.setOrderByClause(UsiTripConstant.USERORDERFIELD);
        return userDao.selectByExample(userExample);
    }

    @Override
    public Integer resetPwdByUsername(String username) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(username).andStatusEqualTo(1);
        User user = userDao.selectByExample(userExample).get(0);

        if (user != null) {
            user.setPassword(UsiTripConstant.DEFAULT_PASSWORD);
            userExample.clear();
            userExample.createCriteria().andUserNameEqualTo(username);
            return userDao.updateByExample(user, userExample);
        }
        return 0;
    }
}

