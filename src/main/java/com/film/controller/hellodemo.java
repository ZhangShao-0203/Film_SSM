package com.film.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class hellodemo {
    @RequestMapping("/index.html")
    public ModelAndView update(ModelAndView mav, HttpSession session) {
        System.out.println("update");
        System.out.println(session);
        System.out.println(session.getAttribute("admin"));
        if (session != null && session.getAttribute("admin") == null) {
            mav.setViewName("admin/login");
        } else {
            mav.setViewName("admin/index");
        }
        return mav;
    }

    @RequestMapping("/login.html")
    public ModelAndView login(ModelAndView mav) {
        System.out.println("login");
        mav.setViewName("admin/login");
        return mav;
    }

    @RequestMapping("/actor.html")
    public String actor(HttpSession session) {
        System.out.println("actor");
        if (session != null && session.getAttribute("admin") == null) {
            return "admin/login";
        } else {
            return "admin/actor";
        }

    }

    @RequestMapping("/cinema.html")
    public String cinema(HttpSession session) {
        System.out.println("cinema");
        if (session != null && session.getAttribute("admin") == null) {
            return "admin/login";
        } else {
            return "admin/cinema";
        }

    }

    @RequestMapping("/choose.html")
    public String choose(HttpSession session) {
        System.out.println("choose");

        if (session != null && session.getAttribute("admin") == null) {
            return "admin/login";
        } else {
            return "admin/choose";
        }
    }

    @RequestMapping("/movie.html")
    public String movie(HttpSession session) {
        System.out.println("movie");

        if (session != null && session.getAttribute("admin") == null) {
            return "admin/login";
        } else {
            return "admin/movie";
        }
    }

    @RequestMapping("/ordert.html")
    public String ordert(HttpSession session) {
        System.out.println("ordert");

        if (session != null && session.getAttribute("admin") == null) {
            return "admin/login";
        } else {
            return "admin/ordert";
        }
    }

    @RequestMapping("/screen.html")
    public String screen(HttpSession session) {
        System.out.println("screen");

        if (session != null && session.getAttribute("admin") == null) {
            return "admin/login";
        } else {
            return "admin/screen";
        }
    }

    @RequestMapping("/update.html")
    public String update(HttpSession session) {
        System.out.println("update");

        if (session == null || session.getAttribute("admin") == null) {
            return "admin/login";
        } else {
            return "admin/update";
        }
    }

    @RequestMapping("/video.html")
    public String video(HttpSession session) {
        System.out.println("video");

        if (session != null && session.getAttribute("admin") == null) {
            return "admin/login";
        } else {
            return "admin/video";
        }
    }

    @RequestMapping("/vip.html")
    public String vip(HttpSession session) {
        System.out.println("vip");

        if (session != null && session.getAttribute("admin") == null) {
            return "admin/login";
        } else {
            return "admin/vip";
        }
    }


}
