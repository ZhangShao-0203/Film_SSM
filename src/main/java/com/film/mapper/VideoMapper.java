package com.film.mapper;

import com.film.pojo.Video;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface VideoMapper {
    int deleteByPrimaryKey(Long viid);

    int insert(Video record);

    Video selectByPrimaryKey(Long viid);

    List<Video> selectAll(Video video);

    int updateByPrimaryKey(Video record);
}