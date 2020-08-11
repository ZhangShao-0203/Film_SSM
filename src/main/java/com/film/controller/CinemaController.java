package com.film.controller;

import com.film.pojo.Cinema;
import com.film.service.ICinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/cinema")
public class CinemaController {

    @Autowired
    ICinemaService cinemaService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Cinema> list(int currPage,int pageSize,String seek){
        List<Cinema> cinemas = cinemaService.list(currPage,pageSize,seek);
        return cinemas;
    }

    @RequestMapping("/listOther")
    @ResponseBody
    public List<Cinema> listOther(){
        List<Cinema> cinemas = cinemaService.listOther();
        return cinemas;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Cinema edit(int cid){
        Cinema cinema = cinemaService.get(cid);
        return cinema;

    }

    @RequestMapping("/update")
    @ResponseBody
    public ModelAndView update(Cinema cinema, ModelAndView mav){
        int i = cinemaService.update(cinema);
        mav.setViewName("/admin/cinema");
        return mav;
    }

    @RequestMapping("/add")
    public ModelAndView add(ModelAndView mav, Cinema cinema){
        int i = cinemaService.add(cinema);
        mav.setViewName("/admin/cinema");
        return mav;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(int cid){
        int i = cinemaService.delete(cid);
        return i;
    }
}
