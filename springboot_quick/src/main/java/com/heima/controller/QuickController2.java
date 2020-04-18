package com.heima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author shkstart
 * @create 2020-04-15 12:13
 */
@Controller
@ConfigurationProperties(prefix = "person")
public class QuickController2 {

    private String name;
    private String addr;
    private String sex;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddr() {
        return addr;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddr(String addr) {
        this.addr = addr;


    }

    @RequestMapping("/quick2")
    @ResponseBody
    public String quick() {
        return "name:" + name + "-----------------addr:" + addr;
    }

}
