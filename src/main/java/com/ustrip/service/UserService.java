package com.ustrip.service;

import com.ustrip.entity.User;
import org.json.JSONObject;

import java.util.List;

public interface UserService {
    User selectUserByUsernameAndPwd(String username, String password);

    Integer deleteUserByUsernameAndPwd(String username, String apiPassword);

    Integer updateUserById(User user);

    Integer updateUserByUsername(User user, String oldUsername);

    User selectUserByUsernameAndApiPwd(String username, String apiPassword);

    User selectUserById(Integer userId);

    List<User> selectUserByCondition(JSONObject conditionData);

    Integer resetPwdByUsername(String username);
}
