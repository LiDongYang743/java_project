package com.heima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2020-04-29 10:53
 */
@RestController
public class HellWordController {


    @RequestMapping("/hello")
    public String hello(){
        return "hello word";
    }

}
