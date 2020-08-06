package com.film.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class demo {
    @RequestMapping("/index.html")
    public ModelAndView index(ModelAndView mav){
        System.out.println("index");
        mav.setViewName("index");
        return mav;
    }

}
