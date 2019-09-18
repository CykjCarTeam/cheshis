package com.soft.web;


import com.soft.aop.Log;
import com.soft.aop.LogContorl;
import com.soft.biz.AdminBiz;
import com.soft.biz.AdminBizImpl;
import com.soft.entity.Admin;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Controller
@RequestMapping("/demo")
public class LoginAction implements SessionAware {
    private Admin admins;
    private Admin admin;
    private List<String> list=new ArrayList<String>();
    private Map<String, Object> session;
    @Resource
    private AdminBiz adminBizImpl;
    @Resource
    private  LogContorl logContorl;
    @Log(LogType="用户操作",LogTypeName = "用户登录")
    @RequestMapping(value = "/execute.action")
    public ModelAndView  execute(HttpServletRequest request, String adminid,String adminpwd)
    {
        ModelAndView mav = new ModelAndView();
        String message="login";
         admin=adminBizImpl.login(new Admin(adminid,adminpwd));
        if (admin!=null)
        {
            request.getSession().setAttribute("admin",admin);
//            session.put("admin",admin);
            message="index";
        }
        mav.setViewName(message);
        return mav;
    }


  /*  public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Admin getAdmins() {
        return admins;
    }

    public void setAdmins(Admin admins) {
        this.admins = admins;
    }*/

    @Override
    public void setSession(Map<String, Object> map) {
        session=map;
    }
}
