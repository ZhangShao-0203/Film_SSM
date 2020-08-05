package com.film.service;

import com.film.pojo.Actor;
import com.film.pojo.Cinema;
import com.film.pojo.MovieActor;

import java.util.List;
import java.util.Map;

public interface IMovieActorService {
    //添加用户
    int add(Map<String,Object> map);
    //查询用户
    List<MovieActor> get(int mid);
    //删除用户
    int delete(Long mid);
    //修改用户
    int update(Map<String,Object> map);
    //查看所有用户
    List<MovieActor> list(int currPage,int pageSize);
}
