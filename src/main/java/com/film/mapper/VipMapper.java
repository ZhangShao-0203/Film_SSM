package com.film.mapper;

import com.film.pojo.Vip;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface VipMapper {
    int deleteByPrimaryKey(Long vid);

    int insert(Vip record);

    Vip selectByPrimaryKey(Long vid);

    List<Vip> selectAll(String seek);

    int updateByPrimaryKey(Vip record);
}