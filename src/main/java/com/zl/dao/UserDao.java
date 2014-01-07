package com.zl.dao;

import com.zl.entity.Userlogin;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 提子
 * Date: 14-1-2
 * Time: 下午4:27
 * To change this template use File | Settings | File Templates.
 */
@Service
public interface UserDao {
    //注册保存User
    public String insertUser(Userlogin userlogin);

    //登录查询User
    public Userlogin checkUser(Userlogin userlogin);

    public Userlogin selectUser(String username,String password);
    //删除User
    public Userlogin deleteUser(Userlogin userlogin);
    //修改User
    public Userlogin update(Userlogin userlogin);

}
