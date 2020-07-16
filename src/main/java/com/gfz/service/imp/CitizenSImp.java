package com.gfz.service.imp;

import com.gfz.dao.CitizenDao;
import com.gfz.dao.CityDao;
import com.gfz.dto.Citizen;
import com.gfz.dto.City;
import com.gfz.service.CitizenService;
import com.gfz.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.util.List;

/**
 * ClassName: CitizenSImp
 * date: 2020/7/15 22:24
 *
 * @author gfz
 */
public class CitizenSImp implements CitizenService {
    @Override
    public List<Citizen> findAll() throws IOException {
        SqlSessionFactory sqlSessionFactory = MybatisUtils.getFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CitizenDao citizenDao = sqlSession.getMapper(CitizenDao.class);
        List<Citizen> list = citizenDao.findAll();
        sqlSession.close();
        return list;
    }

    @Override
    public Citizen findByName(String name) throws IOException {
        SqlSessionFactory sqlSessionFactory = MybatisUtils.getFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CitizenDao citizenDao = sqlSession.getMapper(CitizenDao.class);
        Citizen citizen = citizenDao.findByName(name);
        sqlSession.close();
        return citizen;
    }

    @Override
    public int add(Citizen citizen) throws IOException {
        SqlSessionFactory sqlSessionFactory = MybatisUtils.getFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CitizenDao citizenDao = sqlSession.getMapper(CitizenDao.class);
        int rows = citizenDao.add(citizen);
        sqlSession.commit();
        sqlSession.close();
        return rows;
    }

    @Override
    public int edit(Citizen citizen) throws IOException {
        SqlSessionFactory sqlSessionFactory = MybatisUtils.getFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CitizenDao citizenDao = sqlSession.getMapper(CitizenDao.class);
        int rows = citizenDao.edit(citizen);
        sqlSession.commit();
        sqlSession.close();
        return rows;
    }

    @Override
    public int delete(String id) throws IOException {
        SqlSessionFactory sqlSessionFactory = MybatisUtils.getFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CitizenDao citizenDao = sqlSession.getMapper(CitizenDao.class);
        int rows = citizenDao.delete(id);
        sqlSession.commit();
        sqlSession.close();
        return rows;
    }
}
