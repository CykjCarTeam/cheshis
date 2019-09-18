package com.soft.ioc;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;
@Component
public class Computer
{
    private String cup="i5";
    private String price;
    private List<String> list;
    private Map<String,String> map;
    private Set<String> uset;


    public Computer()
    {
    }

    public Computer(String cup, String price)
    {
        this.cup = cup;
        this.price = price;
    }

    public List<String> getList()
    {
        return list;
    }

    public void setList(List<String> list)
    {
        this.list = list;
    }

    public Map<String, String> getMap()
    {
        return map;
    }

    public void setMap(Map<String, String> map)
    {
        this.map = map;
    }

    public Set<String> getUset()
    {
        return uset;
    }

    public void setUset(Set<String> uset)
    {
        this.uset = uset;
    }

    public String getCup()
    {
        return cup;
    }

    public void setCup(String cup)
    {
        this.cup = cup;
    }

    public String getPrice()
    {
        return price;
    }

    public void setPrice(String price)
    {
        this.price = price;
    }
}
