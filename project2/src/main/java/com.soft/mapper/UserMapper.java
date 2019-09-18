package com.soft.mapper;

import com.soft.entity.User;
import com.soft.entity.UserList;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public User loginUser(User user);
    public boolean addUser(User user);
    public UserList findUserByUserid(@Param("userid") String userid);
}
