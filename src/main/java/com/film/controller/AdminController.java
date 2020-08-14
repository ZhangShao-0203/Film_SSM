package com.film.controller;

import com.film.pojo.Admin;
import com.film.service.IAdminService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    IAdminService adminService;

    @RequestMapping("/login")
    public ModelAndView login(Admin admin,ModelAndView mav,HttpSession session) {

        SimpleHash simpleHash = new SimpleHash("MD5",admin.getApass(),null,3);
        String pwd = simpleHash.toString();
        Subject subject = SecurityUtils.getSubject();//认证主体--2

        //判断当前用户是否登录
        if (subject.isAuthenticated() == false) {
            //进行认证，准备token令牌
            //将当前用户密码封装
            UsernamePasswordToken token = new UsernamePasswordToken(admin.getAid() + "",pwd);
            //执行认证提交
            subject.login(token);
            session.setAttribute("aid", admin.getAid());
            session.setAttribute("admin",admin);
            mav.setViewName("/admin/index");
        }
        return mav;
    }

    //登出
    @RequestMapping("/logout")
    public ModelAndView logout(ModelAndView mav,HttpSession session){
        Subject subject = SecurityUtils.getSubject();
        if(subject !=null){
            subject.logout();
            session.invalidate();
        }
        mav.setViewName("admin/login");
        return mav;
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Admin> list(int currPage,int pageSize){
        List<Admin> admins = adminService.list(currPage,pageSize);
        return admins;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Admin edit(long aid){
        Admin admin = adminService.get(aid);
        return admin;

    }

    @RequestMapping("/update")
    @ResponseBody
    public ModelAndView update(Admin admin, ModelAndView mav){
        int i = adminService.update(admin);
        if(i==1){
            mav.setViewName("/admin/login");
        }else{
            mav.setViewName("/admin/update");
        }
        return mav;
    }

    @RequestMapping("/add")
    public ModelAndView add(ModelAndView mav, Admin admin){

        //加密
        SimpleHash simpleHash = new SimpleHash("MD5",admin.getApass(),null,3);
        String pwd = simpleHash.toString();
        admin.setApass(pwd);

        int i = adminService.add(admin);
        long id = admin.getAid();
        mav.setViewName("/admin/login");
        return mav;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(long aid){
        int i = adminService.delete(aid);
        return i;
    }

}
