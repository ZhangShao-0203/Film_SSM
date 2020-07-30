package com.film.controller;

import com.film.pojo.Vip;
import com.film.service.IVipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/vip")
public class VipController {

    @Autowired
    IVipService vipService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Vip> list(){
        List<Vip> vips = vipService.list();
        return vips;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Vip edit(int id){
        Vip vip = vipService.get(id);
        return vip;
    }

    @RequestMapping("/update")
    @ResponseBody
    public ModelAndView update(Vip vip, ModelAndView mav){
        int i = vipService.update(vip);
        mav.setViewName("/");
        return mav;
    }

    @RequestMapping("/add")
    public ModelAndView add(ModelAndView mav, Vip vip){
        int i = vipService.add(vip);
        mav.setViewName("/");
        return mav;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(int id){
        int i = vipService.delete(id);
        return i;
    }
}
