package com.andy.service;

import com.andy.dto.QueryPageParam;
import com.andy.po.User;
import com.github.pagehelper.PageInfo;

public interface UserService {

    PageInfo<User> queryAllUser(QueryPageParam param);
}
