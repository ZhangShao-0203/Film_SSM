package com.film.controller;

import com.film.pojo.Cinema;
import com.film.pojo.Video;
import com.film.service.IVideoService;
import org.apache.tomcat.PeriodicEventListener;
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
    public List<Video> list(Video video){
        List<Video> videos = videoService.list(video);
        return videos;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Video edit(int viid){
        Video video = videoService.get(viid);
        return video;

    }

    @RequestMapping("/update")
    @ResponseBody
    public ModelAndView update(Video video, ModelAndView mav){
        int i = videoService.update(video);
        mav.setViewName("/admin/video");
        return mav;
    }

    @RequestMapping("/add")
    public ModelAndView add(ModelAndView mav, Video video){
        int i = videoService.add(video);
        mav.setViewName("/admin/video");
        return mav;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(int viid){
        int i = videoService.delete(viid);
        return i;
    }
}
