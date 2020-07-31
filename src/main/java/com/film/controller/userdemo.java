package com.film.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class userdemo {

    @RequestMapping("/index.html")
    public ModelAndView index(ModelAndView mav){
        System.out.println("index");
        mav.setViewName("user/index");
        return mav;
    }

    @RequestMapping("/login.html")
    public ModelAndView login(ModelAndView mav){
        System.out.println("login");
        mav.setViewName("user/login");
        return mav;
    }

    @RequestMapping("/films.html")
    public ModelAndView films(ModelAndView mav){
        System.out.println("films");
        mav.setViewName("user/films");
        return mav;
    }

    @RequestMapping("/cinemas.html")
    public ModelAndView cinemas(ModelAndView mav){
        System.out.println("cinemas");
        mav.setViewName("user/cinemas");
        return mav;
    }

    @RequestMapping("/board.html")
    public ModelAndView board(ModelAndView mav){
        System.out.println("board");
        mav.setViewName("user/board");
        return mav;
    }
}
