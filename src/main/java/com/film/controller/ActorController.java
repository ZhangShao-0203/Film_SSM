package com.film.controller;

import com.film.pojo.Actor;
import com.film.service.IActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.security.Permission;
import java.util.List;

@Controller
@RequestMapping("/actor")
public class ActorController {
    @Autowired
    IActorService actorService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Actor> list(){
        List<Actor> actors = actorService.list();
        return actors;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Actor edit(int id){
        Actor actor = actorService.get(id);
        return actor;

    }

    @RequestMapping("/update")
    @ResponseBody
    public ModelAndView update(Actor actor,ModelAndView mav){
        int i = actorService.update(actor);
        mav.setViewName("/");
        return mav;
    }

    @RequestMapping("/add")
    public ModelAndView add(ModelAndView mav, Actor actor){
        int i = actorService.add(actor);
        mav.setViewName("/");
        return mav;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(int id){
        int i = actorService.delete(id);
        return i;
    }


}
