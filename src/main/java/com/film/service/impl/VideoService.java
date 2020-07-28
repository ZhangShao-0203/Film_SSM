package com.film.service.impl;

import com.film.pojo.Video;
import com.film.service.IVideoService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService implements IVideoService {
    @Autowired
     IVideoService iVideoService;

    @Override
    public int add(Video video) {
        return 0;
    }

    @Override
    public Video get(int id) {
        return null;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public int update(Video video) {
        return 0;
    }

    @Override
    public List<Video> list() {
        return null;
    }
}
