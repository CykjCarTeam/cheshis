package com.soft.biz;

import com.soft.entity.User;
import com.soft.entity.UserList;
import com.soft.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userBiz")
public class UserBizImpl implements UserBiz {
    @Resource
    private UserMapper userMapper;
    @Override
    public User loginUser(User user) {
//        SqlSession session= DbHepler.getSession();
//        UserMapper userMapper=session.getMapper(UserMapper.class);
        return userMapper.loginUser(user);
    }

    @Override
    public boolean addUser(User user)
    {
//        SqlSession session= DbHepler.getSession();
//        UserMapper userMapper=session.getMapper(UserMapper.class);
        boolean flag=userMapper.addUser(user);
//        session.commit();
//        session.close();
        return flag;

    }

    @Override
    public boolean findUserByUserid(String userid)
    {
//        SqlSession session= DbHepler.getSession();
//        UserMapper userMapper=session.getMapper(UserMapper.class);
        UserList user=userMapper.findUserByUserid(userid);
        boolean flag=false;
        if(user!=null)
        {
            flag=true;
        }
        return flag;
    }
}
