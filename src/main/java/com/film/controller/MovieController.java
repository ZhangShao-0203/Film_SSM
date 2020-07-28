package com.film.controller;

import com.film.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MovieController {

    @Autowired
    IMovieService movieService;


}
