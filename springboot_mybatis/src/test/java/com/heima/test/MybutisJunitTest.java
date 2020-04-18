package com.heima.test;

import com.heima.SpringbootMybatisApplication;
import com.heima.domain.User;
import com.heima.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-04-16 20:42
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class MybutisJunitTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testQuery(){
        List<User> users = userMapper.queryUserList();
        for (User user : users) {
            System.out.println("user = " + user);
        }
    }

}
