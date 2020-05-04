package com.ldy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Arrays;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-05-02 22:28
 */
@Controller
public class HelloWorldController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/success")
    public String  success(Map<String,Object> map){
        map.put("hello","<h1>Hello World</h1>");
        map.put("users", Arrays.asList("zhansgan","lisis","wanghweu"));
        return "success";
    }

}
