package com.film.controller;

import com.film.pojo.Vip;
import com.film.service.IVipService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/vip")
public class VipController {

    @Autowired
    IVipService vipService;

    @RequestMapping("/list")
    @ResponseBody
    public String list(Map<String ,Object> map){
        List<Vip> vips = vipService.list(1,2);
        PageInfo<Vip> pageInfo = new PageInfo<Vip>(vips);
        map.put("pageInfo",pageInfo);
        return "/admin/vip";
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Vip edit(int vid){
        Vip vip = vipService.get(vid);
        return vip;
    }

    @RequestMapping("/update")
    @ResponseBody
    public ModelAndView update(Vip vip, ModelAndView mav){
        int i = vipService.update(vip);
        mav.setViewName("/admin/vip");
        return mav;
    }

    @RequestMapping("/add")
    public ModelAndView add(ModelAndView mav, Vip vip){
        int i = vipService.add(vip);
        mav.setViewName("/admin/vip");
        return mav;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(int vid){
        int i = vipService.delete(vid);
        return i;
    }
}
