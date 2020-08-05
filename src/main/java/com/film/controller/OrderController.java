package com.film.controller;

import com.film.pojo.Ordert;
import com.film.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/ordert")
public class OrderController {

    @Autowired
    IOrderService orderService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Ordert> list(int currPage,int pageSize){
        List<Ordert> orderts = orderService.list(currPage,pageSize);
        return orderts;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Ordert edit(int oid){
        Ordert ordert = orderService.get(oid);
        return ordert;

    }

    @RequestMapping("/update")
    @ResponseBody
    public ModelAndView update(Ordert ordert, ModelAndView mav){
        int i = orderService.update(ordert);
        mav.setViewName("/admin/ordert");
        return mav;
    }

    @RequestMapping("/add")
    public ModelAndView add(ModelAndView mav, Ordert ordert){
        int i = orderService.add(ordert);
        mav.setViewName("/admin/ordert");
        return mav;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(int oid){
        int i = orderService.delete(oid);
        return i;
    }

}
