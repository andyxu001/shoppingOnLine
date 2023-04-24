package com.andy.service.impl;

import com.andy.dao.UserDao;
import com.andy.dto.QueryPageParam;
import com.andy.po.User;
import com.andy.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public PageInfo<User> queryAllUser(QueryPageParam param) {
        PageHelper.startPage(param.getPageNum(),param.getPageSize());
        List<User> userList = userDao.queryAllUser();
        return new PageInfo<>(userList);
    }
}
