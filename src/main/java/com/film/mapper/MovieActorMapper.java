package com.film.mapper;

import com.film.pojo.Actor;
import com.film.pojo.MovieActor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface MovieActorMapper {
    //添加用户
    int add(Map<String,Object> map);
    //查询用户
    MovieActor get(int acid,int mid);
    //删除用户
    int delete(int mid);
    //修改用户
    int update(int acid,int mid);
    //查看所有用户
    List<MovieActor> list();
}