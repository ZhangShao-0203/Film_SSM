package com.film.controller;

import com.film.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class VideoController {

    @Autowired
    IVideoService videoService;


}
