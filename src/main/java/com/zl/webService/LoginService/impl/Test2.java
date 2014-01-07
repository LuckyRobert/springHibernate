package com.zl.webService.LoginService.impl;

import com.zl.webService.LoginService.LoginService;

import javax.xml.ws.Endpoint;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 提子
 * Date: 14-1-3
 * Time: 下午4:18
 * To change this template use File | Settings | File Templates.
 */
public class Test2 {

    public static void deployService() {
        System.out.println("Server start ……");
        LoginService service = new LoginServiceImpl();
        String address = "http://localhost:9000/loginService";
        Endpoint.publish(address, service);
    }

    public static void main(String[] args) throws InterruptedException {
        //发布WebService
        deployService();
        System.out.println("server ready ……");
        Thread.sleep(1000 * 60);
        System.out.println("server exiting");
        //休眠60秒后就退出
        System.exit(0);
    }
}
