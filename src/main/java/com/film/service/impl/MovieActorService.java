package com.film.service.impl;

import com.film.mapper.MovieActorMapper;
import com.film.pojo.Actor;
import com.film.pojo.MovieActor;
import com.film.service.IMovieActorService;
import com.github.pagehelper.PageHelper;
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
    public List<MovieActor> get(int mid) {
        return movieActorMapper.selectmid(mid);
    }

    @Override
    public int delete(Long mid) {
        return movieActorMapper.delete(mid);
    }

    @Override
    public int update(Map<String,Object> map) {
        return movieActorMapper.update(map);
    }

    @Override
    public List<MovieActor> list(int currPage,int pageSize) {
        //分页
        PageHelper.startPage(currPage,pageSize);//自动修改sql语句
        return movieActorMapper.list();
    }
}
