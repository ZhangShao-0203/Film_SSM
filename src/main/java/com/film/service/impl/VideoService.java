package com.film.service.impl;

import com.film.mapper.VideoMapper;
import com.film.pojo.Video;
import com.film.service.IVideoService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService implements IVideoService {
    @Autowired
    VideoMapper videoMapper;

    @Override
    public int add(Video video) {
        return videoMapper.insert(video);
    }

    @Override
    public Video get(int id) {
        return videoMapper.selectByPrimaryKey((long) id);
    }

    @Override
    public int delete(int id) {
        return videoMapper.deleteByPrimaryKey((long) id);
    }

    @Override
    public int update(Video video) {
        return videoMapper.updateByPrimaryKey(video);
    }

    @Override
    public List<Video> list(int currPage, int pageSize) {
        //分页
        PageHelper.startPage(currPage,pageSize);//自动修改sql语句
        return videoMapper.selectAll(new Video());
    }

    @Override
    public List<Video> list(Video video) {
        return videoMapper.selectAll(video);
    }
}
