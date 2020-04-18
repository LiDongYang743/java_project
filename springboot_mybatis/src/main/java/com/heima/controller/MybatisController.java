package com.heima.controller;

import com.heima.domain.User;
import com.heima.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-04-16 20:34
 */
@Controller
public class MybatisController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/mybatis")
    @ResponseBody
    public List<User> queryList(){
        List<User> users = userMapper.queryUserList();
        return users;
    }


}
