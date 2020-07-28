package com.film.service.impl;

import com.film.pojo.Cinema;
import com.film.service.ICinemaService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaService implements ICinemaService {
    @Autowired
    private ICinemaService iCinemaService;

    @Override
    public int add(Cinema cinema) {
        return 0;
    }

    @Override
    public Cinema get(int id) {
        return null;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public int update(Cinema cinema) {
        return 0;
    }

    @Override
    public List<Cinema> list() {
        return null;
    }
}
