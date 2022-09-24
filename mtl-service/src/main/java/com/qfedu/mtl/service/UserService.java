package com.qfedu.mtl.service;

import com.qfedu.mtl.beans.User;

/**
 * @Description
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
public interface UserService {

    public User check(String userName, String userPwd);
}
