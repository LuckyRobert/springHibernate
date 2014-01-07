package com.zl.service;

import com.zl.entity.Userlogin;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 提子
 * Date: 14-1-2
 * Time: 下午4:33
 * To change this template use File | Settings | File Templates.
 */

public interface UserService {
    //保存UserLogin

    public String saveUser(Userlogin userlogin);

    //登录UserLogin
    public boolean checkUser(Userlogin userlogin);

    //查询UserLogin
    public Userlogin getUser(String username,String password);
}
