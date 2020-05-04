package com.ldy.componet;

import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author shkstart
 * @create 2020-05-04 10:29
 */
public class MyHandlerInterceptor implements HandlerInterceptor {

    /**
     * 请求前拦截
     * @param request
     * @param response
     * @param handler
     * @return
     */
    //目标方法执行之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("loginUsername");
        if(user == null){
            //未登陆，返回登陆页面
            request.setAttribute("msg","没有权限请先登陆");
            response.sendRedirect("/index.html");
            return false;
        }else{
            //已登陆，放行请求
            return true;
        }

    }

}
