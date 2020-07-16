package com.gfz.dto;

/**
 * ClassName: Citizen
 * date: 2020/7/15 15:52
 *
 * @author gfz
 */
public class Citizen {
    private String idCard;
    private String name;
    private String phone;
    private int sex;

    public Citizen(String idCard, String name, String phone, int sex) {
        this.idCard = idCard;
        this.name = name;
        this.phone = phone;
        this.sex = sex;
    }

    public Citizen() {
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "idCard='" + idCard + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", sex=" + sex +
                '}';
    }
}
