package com.sjq.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user")
public class UserEntity {

    @TableId(type = IdType.AUTO)
    private int id;
    private String name;
    private String sex;
    private int age;
    private String job;
    private String password;

}
