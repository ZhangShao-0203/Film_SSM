package com.film.service.impl;


import com.film.pojo.Movie;
import com.film.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieService implements IMovieService {
    @Autowired
    IMovieService iMovieService;

    @Override
    public int add(Movie movie) {
        return 0;
    }

    @Override
    public Movie get(int id) {
        return null;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public int update(Movie movie) {
        return 0;
    }

    @Override
    public List<Movie> list() {
        return null;
    }
}
