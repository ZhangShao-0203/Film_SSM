package com.film.service.impl;


import com.film.pojo.Vip;
import com.film.service.IVideoService;
import com.film.service.IVipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VipService implements IVipService {

    @Autowired
    IVideoService iVideoService;


    @Override
    public int add(Vip vip) {
        return 0;
    }

    @Override
    public Vip get(int id) {
        return null;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public int update(Vip vip) {
        return 0;
    }

    @Override
    public List<Vip> list() {
        return null;
    }
}
