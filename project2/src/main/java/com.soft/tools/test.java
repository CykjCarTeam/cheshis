package com.soft.tools;

import com.soft.aop.*;
import com.soft.entity.UserList;
import com.soft.entity.UserUp;
import com.soft.ioc.Computer;
import com.soft.ioc.Person;
import com.soft.mapper.WordMapper;
import javafx.application.Application;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class test {

/*    @Test
    public  void findword(){
        SqlSession session=DbHepler.getSession();
        WordMapper mapper=session.getMapper(WordMapper.class);
        List<UserUp> userUp =mapper.findword(null);
        for (int i=0;i<userUp.size();i++)
        {
            UserUp user=userUp.get(i);
            System.out.println(user.getWtitle());
            System.out.println(user.getUserid());
            System.out.println(user.getWtime());
            System.out.println(user.getState().getStatename());
            System.out.println(user.getType().getTypename());
        }

    }*/

    @Test
    @Log(LogType="用户操作",LogTypeName = "用户登录")
    public void addUser(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        LogContorl logContorl= ac.getBean("logContorl",LogContorl.class);
        logContorl.logPint();
    }

    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");



    }
}
