package com.heima.test;

import com.heima.SpringbootSpringdatajpaApplication;
import com.heima.domain.User;
import com.heima.mapper.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-04-16 21:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootSpringdatajpaApplication.class)
public class JpaTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindAll(){
        List<User> list = userRepository.findAll();
        for (User user : list) {
            System.out.println("user = " + user);
        }
    }

    @Test
    public void testfindByName(){
        User user = userRepository.findByusernameAndPassword("zhangsan","123");
        System.out.println("user = " + user);
    }


    @Test
    public void test(){
        User user = userRepository.findByusernameAndPassword("lisi","123");
        System.out.println("user = " + user);
    }
}
