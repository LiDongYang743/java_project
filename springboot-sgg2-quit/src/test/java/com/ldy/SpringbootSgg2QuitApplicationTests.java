package com.ldy;

import com.ldy.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootSgg2QuitApplicationTests {

    @Autowired
    private  Person person;

    @Autowired
    private ApplicationContext ioc;

    @Test
    public void testIOc(){

        boolean b = ioc.containsBean("createHelloWorldService");
        System.out.println("b = " + b);
    }
    

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
