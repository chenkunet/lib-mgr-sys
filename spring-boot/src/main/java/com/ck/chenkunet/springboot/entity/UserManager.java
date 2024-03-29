package com.ck.chenkunet.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 管理员用户
 */
@Data
@AllArgsConstructor
public class UserManager extends User{

    int id;
    String status;

    /**
     * 密码隐藏
     * @param str
     */
    public void setPwd(String str){
        this.pwd = "***";
    }
}
