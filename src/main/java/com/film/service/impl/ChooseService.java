package com.film.service.impl;

import com.film.mapper.ChooseMapper;
import com.film.pojo.Choose;
import com.film.service.IChooseService;
import com.github.pagehelper.PageHelper;
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
    public List<Choose> list(int currPage,int pageSize) {
        //分页
        PageHelper.startPage(currPage,pageSize);//自动修改sql语句
        return chooseMapper.selectAll();
    }
}
