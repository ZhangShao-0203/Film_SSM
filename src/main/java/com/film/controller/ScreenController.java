package com.film.controller;

import com.film.pojo.Cinema;
import com.film.pojo.Screen;
import com.film.service.IScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/screen")
public class ScreenController {

    @Autowired
    IScreenService screenService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Screen> list(){
        List<Screen> screens = screenService.list();
        return screens;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Screen edit(int sid){
        Screen screen = screenService.get(sid);
        return screen;

    }

    @RequestMapping("/update")
    @ResponseBody
    public ModelAndView update(Screen screen, ModelAndView mav){
        int i = screenService.update(screen);
        mav.setViewName("/admin/screen");
        return mav;
    }

    @RequestMapping("/add")
    public ModelAndView add(ModelAndView mav, Screen screen){
        int i = screenService.add(screen);
        mav.setViewName("/admin/screen");
        return mav;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(int sid){
        int i = screenService.delete(sid);
        return i;
    }

}
