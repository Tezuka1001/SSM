package org.lyh.service;

import org.lyh.pojo.User;

public interface UserService {

    User findUserById(int id);

    void updateSchoolById(User user);
}
