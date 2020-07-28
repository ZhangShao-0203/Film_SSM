package com.film.mapper;

import com.film.pojo.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface MovieMapper {
    int deleteByPrimaryKey(Long mid);

    int insert(Movie record);

    Movie selectByPrimaryKey(Long mid);

    List<Movie> selectAll();

    int updateByPrimaryKey(Movie record);
}