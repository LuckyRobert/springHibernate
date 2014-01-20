package com.zl.action;

import com.zl.entity.Userdetail;
import com.zl.entity.Userlogin;
import com.zl.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 提子
 * Date: 14-1-2
 * Time: 下午11:09
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/user")
public class UserAction {

   private Userlogin userlogin;
   @Resource(name = "userServiceImpl")
    private UserService userService;

    //跳转到注册界面
    @RequestMapping("/insert")
    public String insertUser(){

        return "/register";
    }


    //保存注册用户
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String addUser(@ModelAttribute Userlogin userlogin,Model model){
        System.out.println("中国");
        Userdetail userdetail=userlogin.getUserdetail();
        userdetail.setUserlogin(userlogin);
     String uuid=   userService.saveUser(userlogin);
       if(uuid!=null){
           model.addAttribute("result","添加addUser成功！");

       }else {
           model.addAttribute("result","添加User失败！");
       }
        return "/success";

    }
    //登录验证
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String loginUser(@ModelAttribute("userlogin1") @Valid Userlogin userlogin1,BindingResult error,Model model){
        System.out.println(error.hasErrors());
        System.out.println(error);
        boolean bool=userService.checkUser(userlogin1);
        if(!bool){
            model.addAttribute("result","登录失败");

            return "welcome";
        }else {
            model.addAttribute("result","登录成功");
        }

        return "/success";

    }

    public String test(){

        return null;
    }

    public Userlogin getUserlogin() {
        return userlogin;
    }

    public void setUserlogin(Userlogin userlogin) {
        this.userlogin = userlogin;
    }
}
