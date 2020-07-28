package com.film.controller;

import com.film.pojo.Choose;
import com.film.pojo.Ordert;
import com.film.service.IChooseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/choose")
public class ChooseController {

    @Autowired
    IChooseService chooseService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Choose> list(){
        List<Choose> chooses = chooseService.list();
        return chooses;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Choose edit(int id){
        Choose choose = chooseService.get(id);
        return choose;

    }

    @RequestMapping("/update")
    @ResponseBody
    public ModelAndView update(Choose choose, ModelAndView mav){
        int i = chooseService.update(choose);
        mav.setViewName("/");
        return mav;
    }

    @RequestMapping("/add")
    public ModelAndView add(ModelAndView mav, Choose choose){
        int i = chooseService.add(choose);
        mav.setViewName("/");
        return mav;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(int id){
        int i = chooseService.delete(id);
        return i;
    }

}
