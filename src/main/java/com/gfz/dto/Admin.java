package com.gfz.dto;

/**
 * ClassName: SysUser
 * date: 2020/7/15 15:52
 *
 * @author gfz
 */
public class Admin {
    private int id;
    private String username;
    private String passwd;

    public Admin() {
    }

    public Admin(int id, String username, String passwd) {
        this.id = id;
        this.username = username;
        this.passwd = passwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdminname() {
        return username;
    }

    public void setAdminname(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
