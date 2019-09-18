package com.soft.ioc;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Person
{
    private String uname;
    @Resource
    private Computer computer;

    public Person()
    {
    }

    public String getUname()
    {
        return uname;
    }

    public void setUname(String uname)
    {
        this.uname = uname;
    }

    public Computer getComputer()
    {
        return computer;
    }

    public void setComputer(Computer computer)
    {
        this.computer = computer;
    }
}
