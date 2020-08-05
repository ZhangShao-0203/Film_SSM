package com.film.mapper;

import com.film.pojo.Actor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper

public interface ActorMapper {
    int deleteByPrimaryKey(Long acid);

    int insert(Actor record);

    Actor selectByPrimaryKey(Long acid);

    List<Actor> selectAll();

    List<Actor> selectMAll(int mid);

    List<Actor> selectMMAll(String seek);

    int updateByPrimaryKey(Actor record);
}