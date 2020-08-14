package com.film.tools;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //请求路径
        StringBuffer url = request.getRequestURL();

        if(url.indexOf("login")!=-1){
            //放行
            return true;
        }

        //判断session
        HttpSession session = request.getSession(false);
        Subject subject = SecurityUtils.getSubject();
        if(session!=null && session.getAttribute("admin")!=null && subject!=null){
            return true;
        }

        //拦截
        response.sendRedirect(request.getContextPath()+"/admin/fail");
        return false;
    }
}
