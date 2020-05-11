package com.ldy.config;

import com.ldy.servlet.MyServlet;
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.servlet.Servlet;
import javax.servlet.ServletRegistration;

/**
 * @author shkstart
 * @create 2020-05-09 14:12
 */
@Configuration
public class MyServletConfig {

    //注册servlet三大组件
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean<Servlet> servletServletRegistrationBean = new ServletRegistrationBean<>(new MyServlet(),"/myservlet");
        return servletServletRegistrationBean;
    }

    //配置嵌入式的servlet容器
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryWebServerFactoryCustomizer(){
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                factory.setPort(8808);
            }
        };
    }

    @Bean
    public ServletWebServerFactory servletContainer() {
//        JettyServletWebServerFactory tomcat=new JettyServletWebServerFactory();
        UndertowServletWebServerFactory tomcat=new UndertowServletWebServerFactory();
        return tomcat;
    }

}
