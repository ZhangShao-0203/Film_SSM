package com.film.mapper;

import com.film.pojo.Choose;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface ChooseMapper {
    int deleteByPrimaryKey(Long chid);

    int insert(Choose record);

    Choose selectByPrimaryKey(Long chid);

    List<Choose> selectAll();

    int updateByPrimaryKey(Choose record);
}