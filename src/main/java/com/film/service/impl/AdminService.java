package com.film.service.impl;


import com.film.mapper.AdminMapper;
import com.film.pojo.Admin;
import com.film.service.IAdminService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminService implements IAdminService {
    @Autowired
   private AdminMapper adminMapper;
    @Override
    public int add(Admin admin) {
        return adminMapper.insert(admin);
    }

    @Override
    public Admin get(long aid) {
        return adminMapper.selectByPrimaryKey((long) aid);
    }

    @Override
    public int delete(long aid) {
        return adminMapper.deleteByPrimaryKey((long) aid);
    }

    @Override
    public int update(Admin admin) {
        return adminMapper.updateByPrimaryKey(admin);
    }

    @Override
    public List<Admin> list(int currPage,int pageSize) {
        //分页
        PageHelper.startPage(currPage,pageSize);//自动修改sql语句
        return adminMapper.selectAll();
    }

    @Override
    public Admin getAdmin(Admin admin) {
        return adminMapper.selectByPass(admin);
    }


}
