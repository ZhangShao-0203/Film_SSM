package com.film.controller;

import com.film.service.IChooseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ChooseController {

    @Autowired
    IChooseService chooseService;


}
