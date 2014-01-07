package com.zl.webService.LoginService;

import com.zl.entity.Userlogin;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 提子
 * Date: 14-1-3
 * Time: 下午3:23
 * To change this template use File | Settings | File Templates.
 */
@WebService
public interface LoginService {

    public Userlogin getUserLogin(@WebParam(name = "username") String username,@WebParam(name = "password") String password);

    public String getUser();
}
