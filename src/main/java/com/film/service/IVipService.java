package com.film.service;

import com.film.pojo.Vip;

import java.util.List;

public interface IVipService {
    //添加用户
    int add(Vip vip);
    //查询用户
    Vip get(int id);
    //删除用户
    int delete(int id);
    //修改用户
    int update(Vip vip);
    //查看所有用户
    List<Vip> list(int currPage,int pageSize);
}
