package com.film.controller;

import com.film.pojo.Video;
import com.film.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/video")
public class VideoController {

    @Autowired
    IVideoService videoService;


    @RequestMapping("/list")
    @ResponseBody
    public List<Video> list(){
        List<Video> videos = videoService.list();
        return videos;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Video edit(int id){
        Video video = videoService.get(id);
        return video;

    }

    @RequestMapping("/update")
    @ResponseBody
    public ModelAndView update(Video video, ModelAndView mav){
        int i = videoService.update(video);
        mav.setViewName("/");
        return mav;
    }

    @RequestMapping("/add")
    public ModelAndView add(ModelAndView mav, Video video){
        int i = videoService.add(video);
        mav.setViewName("/");
        return mav;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(int id){
        int i = videoService.delete(id);
        return i;
    }
}
