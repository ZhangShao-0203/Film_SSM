package com.film.service.impl;


import com.film.mapper.OrdertMapper;
import com.film.pojo.Cinema;
import com.film.pojo.Ordert;
import com.film.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {
    @Autowired
    OrdertMapper ordertMapper;
    @Override
    public int add(Ordert ordert) {
        return ordertMapper.insert(ordert);
    }

    @Override
    public Ordert get(int id) {
        return ordertMapper.selectByPrimaryKey((long) id);
    }

    @Override
    public int delete(int id) {
        return ordertMapper.deleteByPrimaryKey((long) id);
    }

    @Override
    public int update(Ordert ordert) {
        return ordertMapper.updateByPrimaryKey(ordert);
    }

    @Override
    public List<Ordert> list() {
        return ordertMapper.selectAll();
    }
}
