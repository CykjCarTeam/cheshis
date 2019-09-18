package com.soft.entity;

public class User {
    private String userid;
    private String userpwd;
    private String usersex;
    private String userxl;
    private String userjob;
    private String userphone;
    private String useraddress;
    private String userjf;
    private String userstate;
    private String usertime;
    private String userdownnum;
    private String userimage;

    public User() {
    }

    public User(String userid, String userpwd, String usersex, String userxl, String userjob, String userphone, String useraddress, String usertime, String userimage)
    {
        this.userid = userid;
        this.userpwd = userpwd;
        this.usersex = usersex;
        this.userxl = userxl;
        this.userjob = userjob;
        this.userphone = userphone;
        this.useraddress = useraddress;
        this.usertime = usertime;
        this.userimage = userimage;
    }

    public User(String userid, String userpwd, String usersex, String userxl, String userjob, String userphone, String useraddress, String userjf, String userstate, String usertime, String userdownnum, String userimage) {
        this.userid = userid;
        this.userpwd = userpwd;
        this.usersex = usersex;
        this.userxl = userxl;
        this.userjob = userjob;
        this.userphone = userphone;
        this.useraddress = useraddress;
        this.userjf = userjf;
        this.userstate = userstate;
        this.usertime = usertime;
        this.userdownnum = userdownnum;
        this.userimage = userimage;
    }

    public User(String userid, String userpwd) {
        this.userid = userid;
        this.userpwd = userpwd;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public String getUserxl() {
        return userxl;
    }

    public void setUserxl(String userxl) {
        this.userxl = userxl;
    }

    public String getUserjob() {
        return userjob;
    }

    public void setUserjob(String userjob) {
        this.userjob = userjob;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public String getUserjf() {
        return userjf;
    }

    public void setUserjf(String userjf) {
        this.userjf = userjf;
    }

    public String getUserstate() {
        return userstate;
    }

    public void setUserstate(String userstate) {
        this.userstate = userstate;
    }

    public String getUsertime() {
        return usertime;
    }

    public void setUsertime(String usertime) {
        this.usertime = usertime;
    }

    public String getUserdownnum() {
        return userdownnum;
    }

    public void setUserdownnum(String userdownnum) {
        this.userdownnum = userdownnum;
    }

    public String getUserimage() {
        return userimage;
    }

    public void setUserimage(String userimage) {
        this.userimage = userimage;
    }
}
