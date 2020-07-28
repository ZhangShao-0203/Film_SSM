package com.film.controller;

import com.film.service.ICinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CinemaController {

    @Autowired
    ICinemaService cinemaService;
}
