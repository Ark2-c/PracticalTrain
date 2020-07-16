package com.gfz.dao;

import com.gfz.dto.City;
import java.util.List;

/**
 * ClassName: ProvinceDao
 * date: 2020/7/15 15:59
 *
 * @author gfz
 */

public interface CityDao {
    public  List<City> findAll();
    public City findByName(String name);
    public int edit(City city);
}
