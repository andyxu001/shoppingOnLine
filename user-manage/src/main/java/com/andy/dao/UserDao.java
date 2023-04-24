package com.andy.dao;

import com.andy.mapper.UserMapper;
import com.andy.po.User;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserDao {

    @Resource(name="userMapper")
    private UserMapper userMapper;

    public List<User> queryAllUser() {
       return  userMapper.queryAllUser();
    }
}
