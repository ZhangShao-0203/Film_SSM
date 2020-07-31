package com.film.controller;

import com.film.pojo.Actor;
import com.film.pojo.Movie;
import com.film.service.IMovieActorService;
import com.film.service.IMovieService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    IMovieService movieService;
    @Autowired
    IMovieActorService movieActorService;
    @RequestMapping("/list")
    @ResponseBody
    public List<Movie> list() {
        List<Movie> movies = movieService.list();
        return movies;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Movie edit(int id) {
        Movie movie = movieService.get(id);
        return movie;

    }

    @RequestMapping("/update")
    @ResponseBody
    public ModelAndView update(Movie movie, ModelAndView mav) {
        int i = movieService.update(movie);
        mav.setViewName("/admin/movie");
        return mav;
    }

    @SneakyThrows
    @RequestMapping("/add")
    public ModelAndView add(ModelAndView mav, Movie movie, MultipartFile doc, HttpServletRequest request) {
        String originalFilename = doc.getOriginalFilename();
        String substring = originalFilename.substring(originalFilename.lastIndexOf("."));
        String uuid = UUID.randomUUID().toString();
        String savePath = request.getRealPath("/") + "movies/" + uuid + movie.getMnamec() + substring;
        File file = new File(savePath);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdir();
        }
        doc.transferTo(file);
        //读取路径
        String readPath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/movies/" + uuid + movie.getMnamec() + substring;
        movie.setPhoto(readPath);
        int i = movieService.add(movie);
        Map<String,Object> map=new HashMap();
        map.put("mid",movie.getMid());
        map.put("list",movie.getActorList());
        int add = movieActorService.add(map);
        mav.setViewName("/admin/movie");
        return mav;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(int id) {
        int i = movieService.delete(id);
        return i;
    }
}
