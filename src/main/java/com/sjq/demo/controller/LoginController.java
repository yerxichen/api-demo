package com.sjq.demo.controller;

import com.sjq.demo.service.ShiroService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.tomcat.util.http.parser.Authorization;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/login")
@Api(tags = "登陆")
public class LoginController {
    Logger logger = LoggerFactory.getLogger(LoginController.class);


    @Autowired
    private ShiroService shiroService;

    @ApiOperation(value = "通过用户id获取角色", notes = "通过用户id获取角色")
    @GetMapping("/login")
    @ResponseBody
    public Object getRoleByUserId(String name,String password) {
        Subject subject= SecurityUtils.getSubject();
        UsernamePasswordToken upToken=new UsernamePasswordToken();
        upToken.setUsername(name);
        upToken.setPassword(password.toCharArray());
        subject.login(upToken);
        return String.valueOf(subject.getPrincipal());
    }



}
