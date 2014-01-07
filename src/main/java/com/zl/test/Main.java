package com.zl.test;

import com.zl.entity.Userdetail;
import com.zl.entity.Userlogin;
import com.zl.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 提子
 * Date: 14-1-2
 * Time: 下午5:11
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[]{"spring-context.xml"});
        UserService userService= (UserService) applicationContext.getBean("userServiceImpl");
        System.out.println(userService);
        Userlogin userlogin=new Userlogin();
        userlogin.setUsername("admin");
        userlogin.setPassword("123");

        Userdetail userdetail=new Userdetail();
        userdetail.setAddress("湖南省 长沙市 芙蓉区 芙蓉中路二段168-1号 摩天一号1栋1821室(贺龙体育馆摩天轮的旁边)，410006");
        userdetail.setRealname("钟亮");
        userdetail.setUserlogin(userlogin);
        userlogin.setUserdetail(userdetail);
       String uuid= userService.saveUser(userlogin);
        System.out.println(uuid);

    }
}
