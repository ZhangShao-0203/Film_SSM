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
    public List<Choose> list(int currPage,int pageSize,String seek){
        List<Choose> chooses = chooseService.list(currPage,pageSize,seek);
        return chooses;
    }

    @RequestMapping("/listOther")
    @ResponseBody
    public List<Choose> listOther(Choose choose){
        List<Choose> chooses = chooseService.listOther();
        return chooses;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Choose edit(int chid){
        Choose choose = chooseService.get(chid);
        return choose;

    }

    @RequestMapping("/update")
    @ResponseBody
    public ModelAndView update(Choose choose, ModelAndView mav){
        int i = chooseService.update(choose);
        mav.setViewName("/admin/choose");
        return mav;
    }

    @RequestMapping("/add")
    public ModelAndView add(ModelAndView mav, Choose choose){
        int i = chooseService.add(choose);
        mav.setViewName("/admin/choose");
        return mav;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(int chid){
        int i = chooseService.delete(chid);
        return i;
    }

}
