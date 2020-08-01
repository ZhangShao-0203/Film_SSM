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
    public List<Screen> list() {
        List<Screen> screens = screenService.list();
        return screens;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Screen edit(int sid) {
        Screen screen = screenService.get(sid);
        return screen;

    }

    @RequestMapping("/update")
    public ModelAndView update(Screen screen, ModelAndView mav) {
        int i = screenService.update(screen);
        mav.setViewName("/admin/screen");
        return mav;
    }

    @SneakyThrows
    @DuplicateSubmitToken
    @RequestMapping("/add")
    public void add(HttpServletRequest request, HttpServletResponse response, Screen screen) {
        System.out.println("--------------------");
        int i = screenService.add(screen);
        request.getRequestDispatcher("/admin/screen").forward(request,response);
//        response.sendRedirect("/admin/screen");


    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(int sid) {
        int i = screenService.delete(sid);
        return i;
    }

}
