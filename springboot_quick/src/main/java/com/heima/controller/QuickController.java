package com.heima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author shkstart
 * @create 2020-04-15 12:13
 */
@Controller
public class QuickController {

    @RequestMapping("/quick")
    @ResponseBody
    public String quick() {
        return "hello springboot";
    }

}
