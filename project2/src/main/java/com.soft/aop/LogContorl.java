package com.soft.aop;

import com.soft.entity.Admin;
import org.apache.struts2.ServletActionContext;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpSession;

@Aspect
@Component
public class LogContorl
{
    @Pointcut("execution(* com.soft.web..*.execute(..))")
    public void logPint(){}
    @After("logPint()")
    public void after(JoinPoint joinPoint)
    {
        HttpServletRequest request = ServletActionContext.getRequest();
       // HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        Admin admin  = (Admin) session.getAttribute("admin");
        System.out.println("——————日志处理——————");
//        if(admin!=null)
//        {
            System.out.println("用户名："+admin.getAdminname());
//        }

    }
}
