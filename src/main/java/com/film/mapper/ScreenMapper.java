package com.film.mapper;

import com.film.pojo.Screen;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface ScreenMapper {
    int deleteByPrimaryKey(Long sid);

    int insert(Screen record);

    Screen selectByPrimaryKey(Long sid);

    List<Screen> selectAll();

    int updateByPrimaryKey(Screen record);
}