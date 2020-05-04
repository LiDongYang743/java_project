package com.ldy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-05-04 10:35
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    /**
     * 登录功能
     * @param username
     * @param password
     * @param request
     * @return
     */
    @PostMapping("/login")
    public String login(@RequestParam("username") String username
            , @RequestParam("password") String password, HttpServletRequest request,Map<String,Object> map){
        //把用户名存入session域
        request.getSession().setAttribute("loginUsername",username);
        //判断登录
        if (!StringUtils.isEmpty(username)&& password.equals("123456")){
            return "redirect:/main.html";
        }else {
            map.put("msg","用户名或密码错误");
           return "login";
        }
    }

}
