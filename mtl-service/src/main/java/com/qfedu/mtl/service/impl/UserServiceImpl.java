package com.qfedu.mtl.service.impl;

import com.qfedu.mtl.beans.User;
import com.qfedu.mtl.dao.UserDAO;
import com.qfedu.mtl.service.UserService;
import com.qfedu.mtl.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public User check(String userName, String userPwd) {
        User user = userDAO.selectUserByUserName(userName);
        if (user != null) {
            String s = MD5Utils.md5(userPwd + user.getSalt());
            if (user.getUserPwd().equals(s)) {
                return user;
            }
        }
        return null;
    }
}
