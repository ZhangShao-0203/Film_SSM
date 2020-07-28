package com.film.controller;

import com.film.pojo.Movie;
import com.film.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    IMovieService movieService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Movie> list(){
        List<Movie> movies = movieService.list();
        return movies;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Movie edit(int id){
        Movie movie = movieService.get(id);
        return movie;

    }

    @RequestMapping("/update")
    @ResponseBody
    public ModelAndView update(Movie movie, ModelAndView mav){
        int i = movieService.update(movie);
        mav.setViewName("/");
        return mav;
    }

    @RequestMapping("/add")
    public ModelAndView add(ModelAndView mav, Movie movie){
        int i = movieService.add(movie);
        mav.setViewName("/");
        return mav;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(int id){
        int i = movieService.delete(id);
        return i;
    }
}
