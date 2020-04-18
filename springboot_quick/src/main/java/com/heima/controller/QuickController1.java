package com.heima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author shkstart
 * @create 2020-04-15 12:13
 */
@Controller
public class QuickController1 {

    @Value("${name}")
    private String name;

    @Value("${person.addr}")
    private String addr;

    @RequestMapping("/quick1")
    @ResponseBody
    public String quick() {
        return "name" + name + "addr" + addr;
    }

}
