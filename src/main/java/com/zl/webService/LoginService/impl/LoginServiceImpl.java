package com.zl.webService.LoginService.impl;

import com.zl.entity.Userlogin;
import com.zl.service.UserService;
import com.zl.webService.LoginService.LoginService;

import javax.annotation.Resource;
import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 提子
 * Date: 14-1-3
 * Time: 下午3:40
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "com.zl.webService.LoginService.LoginService",serviceName = "loginService")
public class LoginServiceImpl implements LoginService {

    @Resource(name = "userServiceImpl")
    private UserService userService;

    @Override
    public Userlogin getUserLogin(String username, String password) {
        Userlogin  userlogin=userService.getUser(username,password);
        return userlogin;
    }

    @Override
    public String getUser() {
        return "aa";
    }
}
