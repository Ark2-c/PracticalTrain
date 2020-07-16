package com.gfz.dao;

import com.gfz.dto.Citizen;
import com.gfz.dto.CityCitizen;

import java.util.List;

/**
 * ClassName: CitizenDao
 * date: 2020/7/15 17:42
 *
 * @author gfz
 */
public interface CitizenDao {
    public List<Citizen> findAll();
    public Citizen findByName(String name);
    public int add(Citizen citizen);
    public int edit(Citizen citizen);
    public int delete(String id);
    public List<CityCitizen>  count();
}
