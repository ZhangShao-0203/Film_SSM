package com.film.service.impl;

import com.film.mapper.ChooseMapper;
import com.film.pojo.Choose;
import com.film.pojo.Video;
import com.film.pojo.Vip;
import com.film.service.IChooseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public List<Choose> list(int currPage,int pageSize,String seek) {
        //分页
        PageHelper.startPage(currPage,pageSize);//自动修改sql语句
        List<Choose> chooses = chooseMapper.selectAll(seek);

        PageInfo pageInfo=new PageInfo(chooses);
        for (Choose c:chooses){
            c.setPages(pageInfo.getPages());
            System.out.println("-----"+c.getPages());
        }
        return chooseMapper.selectAll(seek);
    }

    @Override
    public List<Choose> listOther() {
        return chooseMapper.selectAll(null);
    }
}
