package com.gfz.dto;

/**
 * ClassName: CityCitizen
 * date: 2020/7/16 20:52
 *
 * @author gfz
 */
public class CityCitizen {
    private String name;
    private int count;

    public CityCitizen() {
    }

    public CityCitizen(String name, int cityID) {
        this.name = name;
        this.count= cityID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count= count;
    }

    @Override
    public String toString() {
        return "CityCitizen{" +
                "name='" + name + '\'' +
                ", count=" + count+
                '}';
    }
}
