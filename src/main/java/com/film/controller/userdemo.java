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

    @RequestMapping("/cinemadatas.html")
    public ModelAndView cinemadatas(ModelAndView mav){
        System.out.println("cinemadatas");
        mav.setViewName("user/cinemadatas");
        return mav;
    }

    @RequestMapping("/cinemas.html")
    public ModelAndView cinemas(ModelAndView mav){
        System.out.println("cinemas");
        mav.setViewName("user/cinemas");
        return mav;
    }

    @RequestMapping("/login.html")
    public ModelAndView login(ModelAndView mav){
        System.out.println("login");
        mav.setViewName("user/login");
        return mav;
    }

    @RequestMapping("/moviecinema.html")
    public ModelAndView moviecinema(ModelAndView mav){
        System.out.println("moviecinema");
        mav.setViewName("user/moviecinema");
        return mav;
    }
    @RequestMapping("/moviedatas.html")
    public ModelAndView moviedatas(ModelAndView mav){
        System.out.println("moviedatas");
        mav.setViewName("user/moviedatas");
        return mav;
    }
    @RequestMapping("/movies.html")
    public ModelAndView movies(ModelAndView mav){
        System.out.println("movies");
        mav.setViewName("user/movies");
        return mav;
    }
    @RequestMapping("/personal.html")
    public ModelAndView personal(ModelAndView mav){
        System.out.println("personal");
        mav.setViewName("user/personal");
        return mav;
    }
    @RequestMapping("/selectionSeat.html")
    public ModelAndView selectionSeat(ModelAndView mav){
        System.out.println("selectionSeat");
        mav.setViewName("user/selectionSeat");
        return mav;
    }
}
