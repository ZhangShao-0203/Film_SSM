package com.film.mapper;

import com.film.pojo.MovieActor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface MovieActorMapper {
    int insert(MovieActor record);

    List<MovieActor> selectAll();
}