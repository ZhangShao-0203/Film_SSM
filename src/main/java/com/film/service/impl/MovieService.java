package com.film.service.impl;


import com.film.mapper.MovieMapper;
import com.film.pojo.Actor;
import com.film.pojo.Movie;
import com.film.service.IMovieService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieService implements IMovieService {
    @Autowired
    MovieMapper movieMapper;

    @Override
    public int add(Movie movie) {
        return movieMapper.insert(movie);
    }

    @Override
    public Movie get(int id) {
        return movieMapper.selectByPrimaryKey((long) id);
    }

    @Override
    public int delete(int id) {
        return movieMapper.deleteByPrimaryKey((long) id);
    }

    @Override
    public int update(Movie movie) {
        return movieMapper.updateByPrimaryKey(movie);
    }

    @Override
    public List<Movie> list() {
        return movieMapper.selectAll();
    }
    @Override
    public List<Movie> listm(int acid) {
        return movieMapper.selectmAll(acid);
    }
    @Override
    public List<Movie> listmm(int start, int size,String seek) {
        PageHelper.startPage(start,size,"mid asc");
        List<Movie> movies = movieMapper.selectmmAll(seek);
        PageInfo pageInfo=new PageInfo(movies);
        for (Movie m:movies){
            m.setPages(pageInfo.getPages());
        }
        return movies;
    }
}
