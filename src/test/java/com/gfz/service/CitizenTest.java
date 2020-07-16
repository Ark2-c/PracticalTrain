package com.gfz.service;

import com.gfz.dto.City;
import com.gfz.dto.CityCitizen;
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

}
