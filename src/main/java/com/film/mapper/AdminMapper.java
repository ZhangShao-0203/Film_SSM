package com.film.mapper;

import com.film.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface AdminMapper {
    int deleteByPrimaryKey(Long aid);

    int insert(Admin record);

    Admin selectByPrimaryKey(Long aid);

    List<Admin> selectAll();

    int updateByPrimaryKey(Admin record);
}