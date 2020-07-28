package com.film.service.impl;


import com.film.mapper.MovieMapper;
import com.film.pojo.Movie;
import com.film.service.IMovieService;
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
}
