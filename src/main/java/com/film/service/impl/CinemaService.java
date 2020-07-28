package com.film.service.impl;

import com.film.mapper.CinemaMapper;
import com.film.pojo.Cinema;
import com.film.service.ICinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaService implements ICinemaService {
    @Autowired
    private CinemaMapper cinemaMapper;

    @Override
    public int add(Cinema cinema) {
        return cinemaMapper.insert(cinema);
    }

    @Override
    public Cinema get(int id) {
        return cinemaMapper.selectByPrimaryKey((long) id);
    }

    @Override
    public int delete(int id) {
        return cinemaMapper.deleteByPrimaryKey((long) id);
    }

    @Override
    public int update(Cinema cinema) {
        return cinemaMapper.updateByPrimaryKey(cinema);
    }

    @Override
    public List<Cinema> list() {
        return cinemaMapper.selectAll();
    }
}
