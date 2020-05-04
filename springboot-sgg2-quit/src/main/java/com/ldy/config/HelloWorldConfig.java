package com.ldy.config;

import com.ldy.service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shkstart
 * @create 2020-05-01 9:25
 */
@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorldService createHelloWorldService(){
        return new HelloWorldService();
    }

}
