package org.lyh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lyh.pojo.User;
import org.lyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class TestSpring {

    @Autowired
    private UserService userService;

    @Test
    public void testFindUser(){

        int userId = 48891;
        User user = userService.findUserById(userId);
        System.out.println(user);
        user.setSchool("PKU");
        userService.updateSchoolById(user);
        System.out.println(userService.findUserById(userId));
    }
}
