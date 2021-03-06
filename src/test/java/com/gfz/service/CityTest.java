package com.gfz.service;

import com.gfz.dto.City;
import com.gfz.service.imp.CitySImp;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * ClassName: ProvinceTest
 * date: 2020/7/15 16:08
 *
 * @author gfz
 */
public class CityTest {
    @Test
    public void findAll() throws IOException {
        CityService cityService = new CitySImp();
        List<City> list = cityService.findAll();
        System.out.println(list);
    }
    @Test
    public void findByName() throws IOException {
        CityService cityService = new CitySImp();
        City city = cityService.findByName("太原");
        System.out.println(city);
    }
    @Test
    public void edit() throws IOException {
        CityService cityService = new CitySImp();
        City city = new City(1,"太原");
        int row = cityService.edit(city);
        System.out.println(row);
    }
    @Test
    public void add() throws IOException {
        CityService cityService = new CitySImp();
        String[] cities ={"太原","阳泉","长治","晋城","大同","朔州","忻州","晋中","临汾","运城","吕梁"};
        City city;
        int row =0;
        for (int i=2;i<=cities.length;i++){
            city = new City(i,cities[i-1]+"市");
            cityService.add(city);
            row++;
        }

        System.out.println(row);
    }
}
