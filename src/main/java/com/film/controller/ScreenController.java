package com.film.controller;

import com.film.pojo.Screen;
import com.film.service.IScreenService;
import com.film.tools.DuplicateSubmitToken;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller

@RequestMapping("/screen")
public class ScreenController {

    @Autowired
    IScreenService screenService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Screen> list(int currPage,int pageSize,String seek) {
        List<Screen> screens = screenService.list(currPage,pageSize,seek);
        return screens;
    }
    @RequestMapping("/listmm")
    @ResponseBody
    public List<Screen> listmm(Screen screen){
        System.out.println("-------------------------------------");
        return screenService.listmm(screen);
    }
    @RequestMapping("/edit")
    @ResponseBody
    public Screen edit(int sid) {
        Screen screen = screenService.get(sid);
        System.out.println("::::::::::::::::::1::::::::::::::");
        return screen;
    }

    @RequestMapping("/update")
    public ModelAndView update(Screen screen, ModelAndView mav) {
        int i = screenService.update(screen);
        mav.setViewName("/admin/screen");
        System.out.println(":::::::::::2::::::::;;;");
        return mav;
    }

//    @DuplicateSubmitToken
    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response, Screen screen,ModelAndView mav) {
        if(screen.getCid()!=null){
            int i = screenService.add(screen);
        }
        mav.setViewName("/admin/screen");
        return mav;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(int sid) {
        int i = screenService.delete(sid);
        return i;
    }

}
