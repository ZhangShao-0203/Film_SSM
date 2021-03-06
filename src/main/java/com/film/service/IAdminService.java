package com.film.service;

import com.film.pojo.Admin;

import java.util.List;

public interface IAdminService {
    //添加用户
    int add(Admin admin);
    //查询用户
    Admin get(long aid);
    //删除用户
    int delete(long aid);
    //修改用户
    int update(Admin admin);
    //查看所有用户
    List<Admin> list(int currPage,int pageSize);

    Admin getAdmin(Admin admin);
}
