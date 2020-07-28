package com.film.mapper;

import com.film.pojo.Moviec;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface MoviecMapper {
    int deleteByPrimaryKey(Short mcid);

    int insert(Moviec record);

    Moviec selectByPrimaryKey(Short mcid);

    List<Moviec> selectAll();

    int updateByPrimaryKey(Moviec record);
}