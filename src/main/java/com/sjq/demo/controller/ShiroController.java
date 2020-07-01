package com.sjq.demo.controller;

import com.sjq.demo.Utils.PageResult;
import com.sjq.demo.entity.UserEntity;
import com.sjq.demo.service.ShiroService;
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

@RestController
@RequestMapping(value = "/shiro")
@Api(tags = "权限获取")
public class ShiroController {
    Logger logger = LoggerFactory.getLogger(ShiroController.class);

    @Autowired
    private ShiroService shiroService;

    @ApiOperation(value = "通过用户id获取角色", notes = "通过用户id获取角色")
    @GetMapping("/getRoleByUserId")
    @ResponseBody
    public List<String> getRoleByUserId(String id) {
        return shiroService.getRoleByUserId(id);
    }


    @ApiOperation(value = "通过用户id获取权限", notes = "通过用户id获取权限")
    @GetMapping("/getPermissionByUserId")
    @ResponseBody
    public List<String> getPermissionByUserId(String id) {
        return shiroService.getPermissionByUserId(id);
    }


}
