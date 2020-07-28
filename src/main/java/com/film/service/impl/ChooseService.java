package com.film.service.impl;

import com.film.pojo.Choose;
import com.film.service.IChooseService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChooseService implements IChooseService {
    @Autowired
    private IChooseService iChooseService;

    @Override
    public int add(Choose choose) {
        return 0;
    }

    @Override
    public Choose get(int id) {
        return null;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public int update(Choose choose) {
        return 0;
    }

    @Override
    public List<Choose> list() {
        return null;
    }
}
