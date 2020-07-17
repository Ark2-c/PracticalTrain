package com.gfz.service;

import com.gfz.dto.Admin;
import com.gfz.dto.Citizen;
import com.gfz.dto.City;
import com.gfz.dto.CityCitizen;
import com.gfz.service.imp.AdminSImp;
import com.gfz.service.imp.CitizenSImp;
import com.gfz.service.imp.CitySImp;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * ClassName: CitizenTest
 * date: 2020/7/15 22:59
 *
 * @author gfz
 */
public class CitizenTest {
    @Test
    public void cityCitizen() throws IOException {
        CitizenService citizenService = new CitizenSImp();
        List<CityCitizen> list = citizenService.count();
        System.out.println(list);
    }
    @Test
    public void add() throws IOException {
        CitizenService citizenService = new CitizenSImp();
        Citizen citizen;
        for (int i= 0;i<11;i++){
            Integer id = i+1;
            citizen = new Citizen(id.toString(),"test"+i,"123",1,i+1);
            citizenService.add(citizen);
        }

    }
    @Test
    public void getPerson() throws IOException {
        CitizenService citizenService = new CitizenSImp();
        List<Citizen> list= citizenService.getPerson("太原市");
        System.out.println(list);
    }
}
