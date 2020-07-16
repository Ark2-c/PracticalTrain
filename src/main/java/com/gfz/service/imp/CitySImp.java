package com.gfz.service.imp;

import com.gfz.dao.CityDao;
import com.gfz.dto.Citizen;
import com.gfz.dto.City;
import com.gfz.service.CityService;
import com.gfz.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * ClassName: ProvinceSImp
 * date: 2020/7/15 15:58
 *
 * @author gfz
 */
@Service
public class CitySImp implements CityService {
    @Autowired
    private CityDao cityDao;
    @Override
    public List<City> findAll() throws IOException {
        SqlSessionFactory sqlSessionFactory = MybatisUtils.getFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CityDao cityDao = sqlSession.getMapper(CityDao.class);
        List<City> list = cityDao.findAll();
        sqlSession.close();

        return list;
    }

    @Override
    public City findByName(String name) throws IOException {
        SqlSessionFactory sqlSessionFactory = MybatisUtils.getFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CityDao cityDao = sqlSession.getMapper(CityDao.class);
        City city= cityDao.findByName(name);

        sqlSession.close();
        return city;
    }

    @Override
    public int edit(City city) throws IOException {
        SqlSessionFactory sqlSessionFactory = MybatisUtils.getFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CityDao cityDao = sqlSession.getMapper(CityDao.class);
        int rows= cityDao.edit(city);
        sqlSession.commit();
        sqlSession.close();
        return rows;
    }

}
