package com.film.service.impl;


import com.film.mapper.AdminMapper;
import com.film.pojo.Admin;
import com.film.service.IAdminService;
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
    public Admin get(int id) {
        return adminMapper.selectByPrimaryKey((long) id);
    }

    @Override
    public int delete(int id) {
        return adminMapper.deleteByPrimaryKey((long) id);
    }

    @Override
    public int update(Admin admin) {
        return adminMapper.updateByPrimaryKey(admin);
    }

    @Override
    public List<Admin> list() {
        return adminMapper.selectAll();
    }

    @Override
    public Admin getAdmin(Admin admin) {
        return adminMapper.selectByPass(admin);
    }


}
