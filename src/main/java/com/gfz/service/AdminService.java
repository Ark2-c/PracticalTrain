package com.gfz.service;

import com.gfz.dto.Admin;
import com.gfz.dto.Citizen;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * ClassName: AdminService
 * date: 2020/7/15 17:38
 * 增删改查
 * @author gfz
 */
public interface AdminService {
    public List<Admin> findAll() throws IOException;
    public Admin findByName(String username) throws IOException;
    public int add(Admin admin) throws IOException;
    public int edit(Admin admin) throws IOException;
    public int delete(int id) throws IOException;

}
