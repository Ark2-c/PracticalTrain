package com.gfz.service.imp;

import com.gfz.dao.AdminDao;
import com.gfz.dto.Admin;
import com.gfz.dto.Admin;
import com.gfz.service.AdminService;
import com.gfz.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * ClassName: AdminSImp
 * date: 2020/7/15 19:32
 *
 * @author gfz
 */
public class AdminSImp implements AdminService {

    @Override
    public List<Admin> findAll() throws IOException {
        SqlSessionFactory sqlSessionFactory = MybatisUtils.getFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AdminDao AdminDao = sqlSession.getMapper(AdminDao.class);
        List<Admin> list = AdminDao.findAll();
        sqlSession.close();
        return list;
    }

    @Override
    public Admin findByName(String username) throws IOException {
        SqlSessionFactory sqlSessionFactory = MybatisUtils.getFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AdminDao AdminDao = sqlSession.getMapper(AdminDao.class);
        Admin admin = AdminDao.findByName(username);
        System.out.println(admin);
        sqlSession.close();
        return admin;
    }

    @Override
    public int add(Admin admin) throws IOException {
        SqlSessionFactory sqlSessionFactory = MybatisUtils.getFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AdminDao AdminDao = sqlSession.getMapper(AdminDao.class);
        int rows = AdminDao.add(admin);
        sqlSession.commit();
        sqlSession.close();
        return rows;
    }

    @Override
    public int edit(Admin admin) throws IOException {
        SqlSessionFactory sqlSessionFactory = MybatisUtils.getFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AdminDao AdminDao = sqlSession.getMapper(AdminDao.class);
        int rows = AdminDao.edit(admin);
        sqlSession.commit();
        sqlSession.close();
        return rows;
    }

    @Override
    public int delete(int id) throws IOException {
        SqlSessionFactory sqlSessionFactory = MybatisUtils.getFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AdminDao AdminDao = sqlSession.getMapper(AdminDao.class);
        int rows = AdminDao.delete(id);
        sqlSession.commit();
        sqlSession.close();
        return rows;
    }

}
