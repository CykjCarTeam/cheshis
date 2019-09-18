package com.soft.entity;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

public class UserUp {
    private Integer id;
    private String userid;
    private String wtitle;
    private String wtime;
    private String wtype;
    private String typename;
    private String typejf;
//    @Resource
    private Type type;
//    @Resource
    private State state;
    private String wstate;
    private String wabout;
    private String wreadnum;

    public UserUp() {
    }

    public UserUp(Integer id, String userid, String wtitle, String wtime, String wtype, String typename, String typejf, String wstate, String wabout, String wreadnum)
    {
        this.id = id;
        this.userid = userid;
        this.wtitle = wtitle;
        this.wtime = wtime;
        this.wtype = wtype;
        this.typename = typename;
        this.typejf = typejf;
        this.wstate = wstate;
        this.wabout = wabout;
        this.wreadnum = wreadnum;
    }

    public String getTypename()
    {
        return typename;
    }

    public void setTypename(String typename)
    {
        this.typename = typename;
    }

    public String getTypejf()
    {
        return typejf;
    }

    public void setTypejf(String typejf)
    {
        this.typejf = typejf;
    }

    public State getState()
    {
        return state;
    }

    public void setState(State state)
    {
        this.state = state;
    }

    public Type getType()
    {
        return type;
    }

    public void setType(Type type)
    {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getWtitle() {
        return wtitle;
    }

    public void setWtitle(String wtitle) {
        this.wtitle = wtitle;
    }

    public String getWtime() {
        return wtime;
    }

    public void setWtime(String wtime) {
        this.wtime = wtime;
    }

    public String getWtype() {
        return wtype;
    }

    public void setWtype(String wtype) {
        this.wtype = wtype;
    }

    public String getWstate() {
        return wstate;
    }

    public void setWstate(String wstate) {
        this.wstate = wstate;
    }

    public String getWabout() {
        return wabout;
    }

    public void setWabout(String wabout) {
        this.wabout = wabout;
    }

    public String getWreadnum() {
        return wreadnum;
    }

    public void setWreadnum(String wreadnum) {
        this.wreadnum = wreadnum;
    }
}
