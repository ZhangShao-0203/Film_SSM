package com.film.service.impl;

import com.film.mapper.ScreenMapper;
import com.film.pojo.Screen;
import com.film.pojo.Vip;
import com.film.service.IScreenService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScreenService implements IScreenService {
    @Autowired
    ScreenMapper screenMapper;
    @Override
    public int add(Screen screen) {
        return screenMapper.insert(screen);
    }

    @Override
    public Screen get(int id) {
        return screenMapper.selectByPrimaryKey((long) id);
    }

    @Override
    public int delete(int id) {
        return screenMapper.deleteByPrimaryKey((long) id);
    }

    @Override
    public int update(Screen screen) {
        return screenMapper.updateByPrimaryKey(screen);
    }

    @Override
    public List<Screen> list(int  currPage, int pageSize,String seek) {
        //分页
        PageHelper.startPage(currPage,pageSize);//自动修改sql语句
        List<Screen> screens = screenMapper.selectAll(seek);

        PageInfo pageInfo=new PageInfo(screens);
        for (Screen s:screens){
            s.setPages(pageInfo.getPages());
            System.out.println("-----"+s.getPages());
        }
        return screens;
    }

    @Override
    public List<Screen> listmm(Screen screen) {
        return screenMapper.listmm(screen);
    }

}
