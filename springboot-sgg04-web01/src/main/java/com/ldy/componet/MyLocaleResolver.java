package com.ldy.componet;

import org.apache.tomcat.jni.Local;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author shkstart
 * @create 2020-05-03 21:51
 */
public class MyLocaleResolver implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String l = request.getParameter("l");
        Locale locale =Locale.getDefault();
        if (!StringUtils.isEmpty(l)){
            String[] split = l.split("_");
            /**
             * 参数1 ：语言代码
             * 参数2：国家代码
             */
            locale=new Locale(split[0],split[1]);
        }
         return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
