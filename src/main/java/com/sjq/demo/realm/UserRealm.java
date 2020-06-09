package com.sjq.demo.realm;

import com.sjq.demo.entity.UserEntity;
import com.sjq.demo.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    /**
     * 权限
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        return null;
    }

    /**
     * 登陆
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken upToken= (UsernamePasswordToken) authenticationToken;
        String name=  upToken.getUsername();
        UserEntity userEntity=userService.getUserByName(name);
        if(userEntity==null){
            return null;
        }
        SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(name,userEntity.getPassword(),userEntity.getName());
        return authenticationInfo;
    }
}
