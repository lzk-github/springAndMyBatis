package com.kaishengit.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kaishengit.entity.User;
import com.kaishengit.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lzk on 2017/7/12.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    @Transactional
    public void insertInto(User user) {
        userMapper.save(user);
//        throw new RuntimeException("i do...");
    }

    @Transactional
    public PageInfo<User> findByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<User> userList = userMapper.findAll();
        PageInfo<User> pageInfo = new PageInfo<>();
        pageInfo.setList(userList);
        return pageInfo;
    }
}
