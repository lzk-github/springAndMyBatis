package com.kaishengit.mapper;

import com.github.pagehelper.PageInfo;
import com.kaishengit.Application;
import com.kaishengit.entity.User;
import com.kaishengit.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by lzk on 2017/7/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
public class UserMapperTest {

    @Autowired
    private UserService userService;

    @Test
    public void saveTest() {
        User user = new User("333333","pp","pp");
        userService.insertInto(user);
    }
    @Test
    public void findByPage() {
        PageInfo<User> pageInfo = userService.findByPage(1,2);
        List<User> userList = pageInfo.getList();
        for (User u : userList) {
            System.out.println(u);
        }
    }

}
