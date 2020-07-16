package com.gfz.dto;

/**
 * ClassName: Province
 * date: 2020/7/15 15:53
 *
 * @author gfz
 */
public class City {
    private int cityID;
    private String name;

    public City() {
    }

    public City(int cityID, String name) {
        this.cityID = cityID;
        this.name = name;
    }

    public int getProvinceID() {
        return cityID;
    }

    public void setProvinceID(int cityID) {
        this.cityID = cityID;
    }

    public String getProvinceName() {
        return name;
    }

    public void setProvinceName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityID=" + cityID +
                ", name='" + name + '\'' +
                '}';
    }
}
