package com.soft.interceptors;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Interceptors implements Interceptor {
    @Override
    public void destroy() {

    }

    @Override
    public void init() {

    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("拦截前-------");
        Object obj=actionInvocation.getInvocationContext().getSession().get("user");
        if(null!=obj)
        {
             actionInvocation.invoke();
        }
            return "error";


    }
}
