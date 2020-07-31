package com.film.service.impl;


import com.film.mapper.VipMapper;
import com.film.pojo.Vip;
import com.film.service.IVipService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VipService implements IVipService {

    @Autowired
    VipMapper vipMapper;


    @Override
    public int add(Vip vip) {
        return vipMapper.insert(vip);
    }

    @Override
    public Vip get(int id) {
        return vipMapper.selectByPrimaryKey((long) id);
    }

    @Override
    public int delete(int id) {
        return vipMapper.deleteByPrimaryKey((long) id);
    }

    @Override
    public int update(Vip vip) {
        return vipMapper.updateByPrimaryKey(vip);
    }

    @Override
    public List<Vip> list(int currPage, int pageSize) {

        //分页
        PageHelper.startPage(currPage,pageSize);//自动修改sql语句

        return vipMapper.selectAll();
    }
}
