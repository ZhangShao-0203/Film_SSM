package com.film.service.impl;

import com.film.mapper.VideoMapper;
import com.film.pojo.Video;
import com.film.pojo.Vip;
import com.film.service.IVideoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public List<Video> list() {
        return videoMapper.selectAll(null);
    }

    @Override
    public List<Video> list(int currPage, int pageSize,String seek) {
        //分页
        PageHelper.startPage(currPage,pageSize);//自动修改sql语句
        List<Video> videos = videoMapper.selectAll(seek);

        PageInfo pageInfo=new PageInfo(videos);
        for (Video v:videos){
            v.setPages(pageInfo.getPages());
            System.out.println("-----"+v.getPages());
        }
        return videos;
    }

}
