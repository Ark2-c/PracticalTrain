package com.gfz.dao;

import com.gfz.dto.Admin;

import java.util.List;

/**
 * ClassName: AdminDao
 * date: 2020/7/15 17:42
 *
 * @author gfz
 */
public interface AdminDao {
    public List<Admin> findAll();
    public Admin findByName(String username);
    public int add(Admin admin);
    public int edit(Admin admin);
    public int delete(int id);
}
