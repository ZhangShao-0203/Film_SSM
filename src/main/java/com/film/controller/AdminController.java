package com.film.controller;

import com.film.pojo.Admin;
import com.film.service.IAdminService;
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
    @ResponseBody
    public ModelAndView login(Admin admin,ModelAndView mav,HttpSession session){
        Admin admin1 = adminService.getAdmin(admin);
        //session.setAttribute("admin1",admin1);
        mav.setViewName("/admin/index");
        return mav;

    }


    @RequestMapping("/list")
    @ResponseBody
    public List<Admin> list(){
        List<Admin> admins = adminService.list();
        return admins;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Admin edit(int id){
        Admin admin = adminService.get(id);
        return admin;

    }

    @RequestMapping("/update")
    @ResponseBody
    public ModelAndView update(Admin admin, ModelAndView mav){
        int i = adminService.update(admin);
        mav.setViewName("/");
        return mav;
    }

    @RequestMapping("/add")
    public ModelAndView add(ModelAndView mav, Admin admin){
        int i = adminService.add(admin);
        mav.setViewName("/index");
        return mav;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(int id){
        int i = adminService.delete(id);
        return i;
    }

}
