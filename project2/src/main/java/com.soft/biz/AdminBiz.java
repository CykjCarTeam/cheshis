package com.soft.biz;

import com.soft.entity.Admin;
import com.soft.entity.User;
import com.soft.entity.UserList;
import com.soft.entity.UserUp;

import java.util.List;
import java.util.Map;

public interface AdminBiz {
    public Admin login(Admin admin);

    public List<UserList> finduserlist(String userid, String page, String ftime, String ltime,int limit);

    public int pagecount(String userid, String page, String ftime, String ltime);

    public boolean upustate(String userid, String stateid);

    public boolean upupwd(String userid);

    public boolean adduser(UserList user);

    public List<UserUp> findword(String userid,String title, String page, String ftime, String ltime,int limit);
    public int wordpage(String userid,String title, String page, String ftime, String ltime);
}
