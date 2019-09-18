package com.soft.mapper;

import com.soft.entity.Admin;
import com.soft.entity.UserList;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface AdminMapper {
    public Admin login(Admin admin);
    public List<UserList> finduserlist(Map<String,Object> map);
    public List<UserList> finduserpage(Map<String,Object> map);
}
