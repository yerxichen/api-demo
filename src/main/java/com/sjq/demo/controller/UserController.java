package com.sjq.demo.controller;

import com.github.pagehelper.PageInfo;
import com.sjq.demo.Utils.PageResult;
import com.sjq.demo.entity.CpuEntity;
import com.sjq.demo.entity.UserEntity;
import com.sjq.demo.service.CpuService;
import com.sjq.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
@Api(tags = "用户增删改查")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取用户信息", notes = "获取用户信息")
    @GetMapping("/getUserList")
    @ResponseBody
    public List<UserEntity> getUserList() {
        return userService.getUserList();
    }


    @ApiOperation(value = "获取用户信息动态sql条件", notes = "获取用户信息动态sql条")
    @GetMapping("/getUserListWhere")
    @ResponseBody
    public List<UserEntity> getUserListWhere(String bs) {
        return userService.getUserListWhere(bs);
    }


    @ApiOperation(value = "分页查询", notes = "分页查询")
    @GetMapping("/getUserByPage")
    @ResponseBody
    public PageResult getUserByPage(int page, int size) {
        return userService.getUserByPage(page,size);
    }
}
