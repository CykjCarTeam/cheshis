package com.soft.entity;

public class UserList {
    private String userid;
    private String userpwd;
    private String usertime;
    private String userjf;
    private String userupnum;
    private String userdownnum;
    private String stateid;
    private String statename;
    private String usersex;
    private String userxl;
    private String userjob;
    private String userphone;
    private String useraddress;
    private String userimage;
    public UserList() {
    }

    public UserList(String userid, String userpwd, String usertime, String userjf, String userupnum, String userdownnum, String stateid, String statename, String usersex, String userxl, String userjob, String userphone, String useraddress, String userimage) {
        this.userid = userid;
        this.userpwd = userpwd;
        this.usertime = usertime;
        this.userjf = userjf;
        this.userupnum = userupnum;
        this.userdownnum = userdownnum;
        this.stateid = stateid;
        this.statename = statename;
        this.usersex = usersex;
        this.userxl = userxl;
        this.userjob = userjob;
        this.userphone = userphone;
        this.useraddress = useraddress;
        this.userimage = userimage;
    }

    public UserList(String userid, String userpwd, String usertime, String userjf, String userupnum, String userdownnum, String stateid, String statename, String usersex, String userxl, String userjob, String userphone, String useraddress) {
        this.userid = userid;
        this.userpwd = userpwd;
        this.usertime = usertime;
        this.userjf = userjf;
        this.userupnum = userupnum;
        this.userdownnum = userdownnum;
        this.stateid = stateid;
        this.statename = statename;
        this.usersex = usersex;
        this.userxl = userxl;
        this.userjob = userjob;
        this.userphone = userphone;
        this.useraddress = useraddress;
    }

    public String getUserimage() {
        return userimage;
    }

    public void setUserimage(String userimage) {
        this.userimage = userimage;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getUsertime() {
        return usertime;
    }

    public void setUsertime(String usertime) {
        this.usertime = usertime;
    }

    public String getUserjf() {
        return userjf;
    }

    public void setUserjf(String userjf) {
        this.userjf = userjf;
    }

    public String getUserupnum() {
        return userupnum;
    }

    public void setUserupnum(String userupnum) {
        this.userupnum = userupnum;
    }

    public String getUserdownnum() {
        return userdownnum;
    }

    public void setUserdownnum(String userdownnum) {
        this.userdownnum = userdownnum;
    }

    public String getStateid() {
        return stateid;
    }

    public void setStateid(String stateid) {
        this.stateid = stateid;
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
}
