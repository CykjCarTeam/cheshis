package com.soft.dao;

import com.soft.entity.Admin;
import com.soft.entity.UserList;

import java.util.List;

public interface AdminDao {
    public Admin findAdminbyAdmin(Admin admin);//登录
    public List<UserList> userlist(String userid, String page,String ftime,String ltime);//查询后台用户列表
    public int pagecount(String userid, String page,String ftime,String ltime);//后台分页页码
    public boolean upustate(String userid,String stateid);//通用状态修改
    public boolean upupwd(String userid);//后台用户修改前台用户密码
    public boolean adduser(UserList user);//添加用户（包括头像）
}
