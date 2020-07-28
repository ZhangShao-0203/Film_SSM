package com.film.mapper;

import com.film.pojo.Ordert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface OrdertMapper {
    int deleteByPrimaryKey(Long oid);

    int insert(Ordert record);

    Ordert selectByPrimaryKey(Long oid);

    List<Ordert> selectAll();

    int updateByPrimaryKey(Ordert record);
}