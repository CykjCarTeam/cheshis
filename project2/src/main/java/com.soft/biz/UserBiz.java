package com.soft.biz;

import com.soft.entity.Admin;
import com.soft.entity.User;
import com.soft.entity.UserList;

import java.util.List;

public interface UserBiz {
    public User loginUser(User user);
    public boolean addUser(User user);
    public boolean findUserByUserid(String userid);
}
