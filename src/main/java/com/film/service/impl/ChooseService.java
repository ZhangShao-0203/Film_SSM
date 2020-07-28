package com.film.service.impl;

import com.film.mapper.ChooseMapper;
import com.film.pojo.Choose;
import com.film.service.IChooseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChooseService implements IChooseService {
    @Autowired
    private ChooseMapper chooseMapper;

    @Override
    public int add(Choose choose) {
        return chooseMapper.insert(choose);
    }

    @Override
    public Choose get(int id) {
        return chooseMapper.selectByPrimaryKey((long) id);
    }

    @Override
    public int delete(int id) {
        return chooseMapper.deleteByPrimaryKey((long) id);
    }

    @Override
    public int update(Choose choose) {
        return chooseMapper.updateByPrimaryKey(choose);
    }

    @Override
    public List<Choose> list() {
        return chooseMapper.selectAll();
    }
}
