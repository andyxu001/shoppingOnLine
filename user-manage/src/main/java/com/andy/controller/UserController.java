package com.andy.controller;

import com.andy.dto.QueryPageParam;
import com.andy.entity.ResponseEntity;
import com.andy.po.User;
import com.andy.service.UserService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(tags = "UserController",description = "用户管理")
@RestController
@RefreshScope
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @ApiOperation(value = "获取所有用户")
    @RequestMapping(value = "/getusers",method = RequestMethod.POST)
    public ResponseEntity<PageInfo<User>> getUsers(@RequestBody QueryPageParam param){
        PageInfo<User> allUser = userService.queryAllUser(param);
        return ResponseEntity.ok("查询用户列表成功",allUser).build();
    }
}
