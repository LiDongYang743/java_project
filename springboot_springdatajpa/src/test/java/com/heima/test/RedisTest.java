package com.heima.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.heima.SpringbootSpringdatajpaApplication;
import com.heima.domain.User;
import com.heima.mapper.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-04-16 21:32
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootSpringdatajpaApplication.class)
public class RedisTest {

    @Autowired
    private RedisTemplate<String, String> template;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testRedis() throws JsonProcessingException {
        //1、从redis服务器查询数据，数据形式是json格式
        String userList = template.boundValueOps("user.findAll").get();
        //2、判断redis中是否有数据
        if (userList == null) {
            //3、不存在数据从数据库查询
            List<User> list = userRepository.findAll();
            //4、将查询出的数据存在redis缓存中
            //将数据转换为json格式
            ObjectMapper mapper = new ObjectMapper();
            userList = mapper.writeValueAsString(list);
            template.boundValueOps("user.findAll").set(userList);
            System.out.println("===========从数据库中查询=============");
        }else {
            System.out.println("==============从redis缓存中查询");
        }
        //5、打印查询的数据
        System.out.println("userList = " + userList);
    }

}
