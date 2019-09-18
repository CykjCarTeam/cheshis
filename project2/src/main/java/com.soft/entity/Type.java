package com.soft.entity;



public class Type
{
    private Integer typeid;
    private String typename;
    private Integer typejf;

    public Type()
    {
    }

    public Type(Integer typeid, String typename, Integer typejf)
    {
        this.typeid = typeid;
        this.typename = typename;
        this.typejf = typejf;
    }

    public Integer getTypeid()
    {
        return typeid;
    }

    public void setTypeid(Integer typeid)
    {
        this.typeid = typeid;
    }

    public String getTypename()
    {
        return typename;
    }

    public void setTypename(String typename)
    {
        this.typename = typename;
    }

    public Integer getTypejf()
    {
        return typejf;
    }

    public void setTypejf(Integer typejf)
    {
        this.typejf = typejf;
    }
}
