package com.film.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class hellodemo {
    @RequestMapping("/index.html")
    public ModelAndView update(ModelAndView mav){
        System.out.println("update");
        mav.setViewName("admin/index");
        return mav;
    }
    @RequestMapping("/actor.html")
    public String actor(){
        System.out.println("actor");
        return "admin/actor";
    }
    @RequestMapping("/cinema.html")
    public String cinema(){
        System.out.println("cinema");
        return "admin/cinema";
    }
    @RequestMapping("/choose.html")
    public String choose(){
        System.out.println("choose");
        return "admin/choose";
    }
    @RequestMapping("/movie.html")
    public String movie(){
        System.out.println("movie");
        return "admin/movie";
    }
    @RequestMapping("/ordert.html")
    public String ordert(){
        System.out.println("ordert");
        return "admin/ordert";
    }
    @RequestMapping("/screen.html")
    public String screen(){
        System.out.println("screen");
        return "admin/screen";
    }
    @RequestMapping("/update.html")
    public String update(){
        System.out.println("update");
        return "admin/update";
    }
    @RequestMapping("/video.html")
    public String video(){
        System.out.println("video");
        return "admin/video";
    }
    @RequestMapping("/vip.html")
    public String vip(){
        System.out.println("vip");
        return "admin/vip";
    }
}
