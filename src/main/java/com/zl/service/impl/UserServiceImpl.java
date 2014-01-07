package com.zl.service.impl;

import com.zl.dao.UserDao;
import com.zl.entity.Userlogin;
import com.zl.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 提子
 * Date: 14-1-2
 * Time: 下午4:45
 * To change this template use File | Settings | File Templates.
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {


    @Resource
    private UserDao userDao;

    @Override
    public String saveUser(Userlogin userlogin) {
        return userDao.insertUser(userlogin);
    }

    //登录验证
    @Override
    public boolean checkUser(Userlogin userlogin) {
      Userlogin u2=userDao.checkUser(userlogin);
        return u2 != null;
    }

    @Override
    public Userlogin getUser(String username,String password) {
        return userDao.selectUser(username,password);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
