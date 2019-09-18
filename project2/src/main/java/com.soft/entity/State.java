package com.soft.entity;

public class State
{
    private Integer stateid;
    private String statename;

    public State()
    {
    }

    public State(Integer stateid, String statename)
    {
        this.stateid = stateid;
        this.statename = statename;
    }

    public Integer getStateid()
    {
        return stateid;
    }

    public void setStateid(Integer stateid)
    {
        this.stateid = stateid;
    }

    public String getStatename()
    {
        return statename;
    }

    public void setStatename(String statename)
    {
        this.statename = statename;
    }
}
