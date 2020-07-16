package com.gfz.service;

import com.gfz.dto.Citizen;
import com.gfz.dto.City;

import java.io.IOException;
import java.util.List;

/**
 * ClassName: CitizenService
 * date: 2020/7/15 17:40
 *增删改查
 * @author gfz
 */
public interface CitizenService {
    public List<Citizen> findAll() throws IOException;
    public Citizen findByName(String name) throws IOException;
    public int add(Citizen citizen) throws IOException;
    public int edit(Citizen citizen) throws IOException;
    public int delete(String id) throws IOException;
}
