package com.gfz.service;

import com.gfz.dto.Admin;
import com.gfz.service.imp.AdminSImp;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * ClassName: AdminTest
 * date: 2020/7/15 21:34
 *
 * @author gfz
 */
public class AdminTest {
    @Test
    public void findByName() throws IOException {
        AdminService adminService = new AdminSImp();
        Admin admin = adminService.findByName("gfz2");
        System.out.println(admin);
    }
    @Test
    public void findAll() throws IOException {
        AdminService adminService = new AdminSImp();
        List<Admin> list = adminService.findAll();
        System.out.println(list);
    }
    @Test
    public void add() throws IOException {
        AdminService adminService = new AdminSImp();
        Admin admin = new Admin(3,"gfz2","123");
        int rows = adminService.add(admin);
        System.out.println(rows);
    }
    @Test
    public void edit() throws IOException {
        AdminService adminService = new AdminSImp();
        Admin admin = new Admin(3,"gfz2","321");
        int rows = adminService.edit(admin);
        System.out.println(rows);
    }
    @Test
    public void delete() throws IOException {
        AdminService adminService = new AdminSImp();
        int rows = adminService.delete(2);
        System.out.println(rows);
    }
}
