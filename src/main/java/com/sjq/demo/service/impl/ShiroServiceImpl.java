package com.sjq.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sjq.demo.entity.PermissionEntity;
import com.sjq.demo.entity.RoleEntity;
import com.sjq.demo.entity.RolePermissionEntity;
import com.sjq.demo.entity.UserRoleEntity;
import com.sjq.demo.mapper.UserRoleMapper;
import com.sjq.demo.service.ShiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShiroServiceImpl implements ShiroService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public List<String> getRoleByUserId(int id) {
        QueryWrapper qw=new QueryWrapper();
        qw.eq("user",id);
        return userRoleMapper.selectList(qw);
    }

    @Override
    public List<String> getPermissionByUserId(int id) {
//        List<UserRoleEntity> mList=getRoleByUserId(id);
//        for (UserRoleEntity ur:mList
//             ) {
//
//        }
        return null;
    }
}
