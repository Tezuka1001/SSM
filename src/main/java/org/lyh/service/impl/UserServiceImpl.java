package org.lyh.service.impl;

import org.lyh.mapper.UserMapper;
import org.lyh.pojo.User;
import org.lyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public void updateSchoolById(User user) {
        userMapper.updateByUser(user);
    }
}
