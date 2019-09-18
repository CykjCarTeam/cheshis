package com.soft.web;

import com.opensymphony.xwork2.ActionSupport;
import com.soft.biz.UserBiz;
import com.soft.entity.User;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.stereotype.Controller;


import javax.annotation.Resource;
import java.util.Map;
@Controller
public class UserLoginAction extends ActionSupport implements SessionAware {
    private User users;
    private User user;
    private String msg;
    private Map<String, Object> sessionmap;
    @Resource
    private UserBiz userBizImpl;
    public String login()
    {
        String message="error";
        user=userBizImpl.loginUser(users);
        if(null!=user)
        {
            sessionmap.put("user",user);
            message="success";
        }
        return message;
    }
    public String check()
    {
        msg="2";
        String userid=user.getUserid();
        boolean flag=userBizImpl.findUserByUserid(userid);
        if(flag)
        {
            msg="1";
        }
        return "ucheck";
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        sessionmap=map;
    }
}
