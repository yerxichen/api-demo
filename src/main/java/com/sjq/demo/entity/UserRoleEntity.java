package com.sjq.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user_role")
public class UserRoleEntity {

    private String user;
    private String role;
}
