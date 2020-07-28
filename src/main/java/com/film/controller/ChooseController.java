package com.film.controller;

import com.film.service.IChooseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/choose")
public class ChooseController {

    @Autowired
    IChooseService chooseService;


}
