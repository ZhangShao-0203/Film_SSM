package com.film.controller;

import com.film.service.IScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ScreenController {

    @Autowired
    IScreenService screenService;


}
