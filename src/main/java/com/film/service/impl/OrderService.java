package com.film.service.impl;


import com.film.pojo.Cinema;
import com.film.pojo.Ordert;
import com.film.service.IOrderService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {
    @Autowired
     IOrderService iOrderService;
    @Override
    public int add(Ordert ordert) {
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
    public int update(Ordert ordert) {
        return 0;
    }

    @Override
    public List<Ordert> list() {
        return null;
    }
}
