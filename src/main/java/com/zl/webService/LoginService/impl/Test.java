package com.zl.webService.LoginService.impl;

import com.zl.webService.LoginService.LoginService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 提子
 * Date: 14-1-3
 * Time: 下午4:11
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String[] args) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(LoginService.class);
        factory.setAddress("http://localhost:9000/loginService");

        LoginService service = (LoginService) factory.create();
        System.out.println("[result]" + service.getUserLogin("hoojo","厉害"));
    }
}
