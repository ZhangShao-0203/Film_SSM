package com.film.service.impl;

import com.film.mapper.CinemaMapper;
import com.film.pojo.Cinema;
import com.film.pojo.Vip;
import com.film.service.ICinemaService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public List<Cinema> list(int currPage,int pageSize,String seek) {
        //分页
        PageHelper.startPage(currPage,pageSize);//自动修改sql语句
        List<Cinema> cinemas = cinemaMapper.selectAll(seek);

        PageInfo pageInfo=new PageInfo(cinemas);
        for (Cinema c:cinemas){
            c.setPages(pageInfo.getPages());
            System.out.println("-----"+c.getPages());
        }
        return cinemas;
    }

    @Override
    public List<Cinema> listOther(Cinema cinema) {
        return cinemaMapper.listOther(cinema);
    }
}
