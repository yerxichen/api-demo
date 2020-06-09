package com.sjq.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sjq.demo.entity.PermissionEntity;
import com.sjq.demo.entity.RoleEntity;
import com.sjq.demo.entity.RolePermissionEntity;
import com.sjq.demo.entity.UserRoleEntity;
import com.sjq.demo.mapper.PermissionMapper;
import com.sjq.demo.mapper.RoleMapper;
import com.sjq.demo.mapper.RolePermissionMapper;
import com.sjq.demo.mapper.UserRoleMapper;
import com.sjq.demo.service.ShiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShiroServiceImpl implements ShiroService {

    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RolePermissionMapper rolePermissionMapper;
    @Autowired
    private PermissionMapper permissionMapper;


    /**
     * 通过用户id获取用户角色
     *
     * @param userId
     * @return
     */
    @Override
    public List<String> getRoleByUserId(String userId) {
        //通过userId获取roleId
        List<UserRoleEntity> urList = userRoleMapper.selectList(new QueryWrapper<UserRoleEntity>().eq("user_id", userId));
        //通过roleId获取role
        List<String> rList = new ArrayList<>();
        for (UserRoleEntity ur : urList) {
            rList.add(roleMapper.selectById(ur.getRoleId()).getRole());
        }
        return rList;
    }

    @Override
    public List<String> getPermissionByUserId(String userId) {
        //通过userId获取roleId
        List<UserRoleEntity> urList = userRoleMapper.selectList(new QueryWrapper<UserRoleEntity>().eq("user_id", userId));
        //通过roleId获取permissionId
        List<RolePermissionEntity> rpList = new ArrayList<>();
        for (UserRoleEntity ur : urList) {
            rpList.addAll(rolePermissionMapper.selectList(new QueryWrapper<RolePermissionEntity>().eq("role_id",ur.getRoleId())));
        }
        //通过permissionId获取permission
        List<String> pList = new ArrayList<>();
        for (RolePermissionEntity rp : rpList) {
            pList.add(permissionMapper.selectById(rp.getPermissionId()).getPermission());
        }
        return pList;
    }
}
