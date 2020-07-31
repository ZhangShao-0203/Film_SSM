package com.film.service.impl;

import com.film.mapper.MovieActorMapper;
import com.film.pojo.Actor;
import com.film.pojo.MovieActor;
import com.film.service.IMovieActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MovieActorService implements IMovieActorService {
    @Autowired
    MovieActorMapper movieActorMapper;
    @Override
    public int add(Map<String,Object> map) {
        return movieActorMapper.add(map);
    }

    @Override
    public MovieActor get(int acid, int mid) {
        return movieActorMapper.get(acid,mid);
    }

    @Override
    public int delete( int mid) {
        return movieActorMapper.delete(mid);
    }

    @Override
    public int update(int acid, int mid) {
        return movieActorMapper.update(acid,mid);
    }

    @Override
    public List<MovieActor> list() {
        return movieActorMapper.list();
    }
}
