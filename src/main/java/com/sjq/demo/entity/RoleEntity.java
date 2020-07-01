package com.sjq.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_role")
public class RoleEntity {

    @TableId(type = IdType.AUTO)
    private String id;
    private String role;
    private String description;
}
