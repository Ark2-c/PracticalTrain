package com.gfz.service;

import com.gfz.dto.City;
import com.gfz.dto.City;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * ClassName: ProvinceService
 * date: 2020/7/15 15:56
 * 改、查（所有和by name)
 * @author gfz
 */
@Service
public interface CityService {

    public List<City> findAll() throws IOException;
    public City findByName(String name) throws IOException;
    public int edit(City city)throws IOException;

}

