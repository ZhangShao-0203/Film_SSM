package com.film.service.impl;

import com.film.pojo.Cinema;
import com.film.pojo.Screen;
import com.film.service.IScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScreenService implements IScreenService {
    @Autowired
    IScreenService iScreenService;
    @Override
    public int add(Screen screen) {
        return 0;
    }

    @Override
    public Screen get(int id) {
        return null;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public int update(Screen screen) {
        return 0;
    }

    @Override
    public List<Screen> list() {
        return null;
    }
}
