package com.soft.entity;

public class Admin {
    private String adminid;
    private String adminname;
    private String adminpwd;
    public Admin() {
    }

    public Admin(String adminid, String adminpwd) {
        this.adminid = adminid;
        this.adminpwd = adminpwd;
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdminpwd() {
        return adminpwd;
    }

    public void setAdminpwd(String adminpwd) {
        this.adminpwd = adminpwd;
    }
}
