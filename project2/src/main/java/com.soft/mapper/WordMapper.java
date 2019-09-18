package com.soft.mapper;

import com.soft.entity.Admin;
import com.soft.entity.UserList;
import com.soft.entity.UserUp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface WordMapper
{
    public List<UserUp> findword(Map map);
    public List<UserUp> wordpage(Map map);
}
