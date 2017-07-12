package com.kaishengit.mapper;

import com.kaishengit.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lzk on 2017/7/12.
 */
//@Repository
public interface UserMapper {
    void save(User user);
    User findById(Integer id);
    List<User> findAll();
}
