package com.film.service;

import com.film.pojo.Video;

import java.util.List;

public interface IVideoService {
    //添加用户
    int add(Video video);
    //查询用户
    Video get(int id);
    //删除用户
    int delete(int id);
    //修改用户
    int update(Video video);
    //查看所有用户
    List<Video> list(int currPage,int pageSize);

    List<Video> list(Video video);
}
