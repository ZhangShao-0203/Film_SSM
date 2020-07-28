package com.film.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class hellodemo {
//    @RequestMapping("/hello")
//    public String hello(){
//        System.out.println("aa");
//        return "index";
//    }
    @RequestMapping("/admin/index.html")
    public ModelAndView update(ModelAndView mav){
        System.out.println("update");
        mav.setViewName("admin/index");
        return mav;
    }
    @RequestMapping("/admin/actor.html")
    public String actor(){
        System.out.println("actor");
        return "admin/actor";
    }
}
