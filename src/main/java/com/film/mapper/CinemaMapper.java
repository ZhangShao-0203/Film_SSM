package com.film.mapper;

import com.film.pojo.Cinema;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface CinemaMapper {
    int deleteByPrimaryKey(Long cid);

    int insert(Cinema record);

    Cinema selectByPrimaryKey(Long cid);

    List<Cinema> selectAll();

    int updateByPrimaryKey(Cinema record);
}