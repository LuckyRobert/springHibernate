package com.zl.dao.imp;

import com.zl.dao.UserDao;
import com.zl.entity.Userlogin;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 提子
 * Date: 14-1-2
 * Time: 下午4:32
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class UserDaoImpl implements UserDao {
   @Resource
    private SessionFactory sessionFactory;

    @Override
    public String insertUser(Userlogin userlogin) {
        Session session=sessionFactory.getCurrentSession();

        return session.save(userlogin).toString();
    }

    @Override
    public Userlogin checkUser(Userlogin userlogin) {
        Userlogin userlogin2= (Userlogin) sessionFactory.getCurrentSession().createQuery("select o from Userlogin o where o.username=:uname and o.password=:pwd").setString("uname",userlogin.getUsername()).setString("pwd",userlogin.getPassword()).uniqueResult();


        return userlogin2;
    }

    @Override
    public Userlogin selectUser(String username,String password) {
        Session session=sessionFactory.getCurrentSession();
        Userlogin userlogin= (Userlogin) session.createQuery("select o from Userlogin as o where o.username=:uname and o.password=:pwd").setString("uname",username).setString("pwd",password).uniqueResult();
        return userlogin;
    }

    @Override
    public Userlogin deleteUser(Userlogin userlogin) {
        return null;
    }

    @Override
    public Userlogin update(Userlogin userlogin) {
        return null;
    }

}
