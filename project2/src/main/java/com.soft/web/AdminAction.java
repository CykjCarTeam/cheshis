package com.soft.web;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.soft.aop.Log;
import com.soft.biz.AdminBiz;
import com.soft.biz.AdminBizImpl;
import com.soft.entity.UserList;

import com.soft.entity.UserUp;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Controller
@RequestMapping("/admin")
public class AdminAction extends ActionSupport {
    private String code;
    private int page;
    private int limit;
    private String cnum;
    private String userid;
    private String ftime;
    private String ltime;
    private String ntitle;
    private List<UserList> userlist;
    private List<UserUp> wordlist;
    private Map<String,Object> usermap=new HashMap<String, Object>();
    private Map<String,Object> wordmap=new HashMap<String, Object>();
    @Resource
    private  AdminBiz adminBizImpl;
    @Log(LogType="用户操作",LogTypeName = "查询列表")
    @RequestMapping(value="/find.action", method= RequestMethod.GET, produces="application/json;charset=utf-8")
    public @ResponseBody Map find(String userid, int page,String ftime, String ltime,int limit)
    {

        userlist=adminBizImpl.finduserlist(userid,page+"",ftime,ltime,limit);

        String pagecount=adminBizImpl.pagecount(userid,page+"",ftime,ltime)+"";
        usermap.put("code",0);
        usermap.put("data",userlist);
        usermap.put("userid",userid);
        usermap.put("ftime",ftime);
        usermap.put("ltime",ltime);
        usermap.put("count",pagecount);

     return usermap;
    }
    public String findwork()
    {
        wordlist=adminBizImpl.findword(userid,ntitle,page+"",ftime,ltime,limit);
        int pagesum=adminBizImpl.wordpage(userid,ntitle,page+"",ftime,ltime);
        wordmap.put("code",0);
        wordmap.put("data",wordlist);
        wordmap.put("ntitle",ntitle);
        wordmap.put("userid",userid);
        wordmap.put("ftime",ftime);
        wordmap.put("ltime",ltime);
        wordmap.put("count",pagesum);
        return "wtable";
    }

    public Map<String, Object> getWordmap()
    {
        return wordmap;
    }

    public void setWordmap(Map<String, Object> wordmap)
    {
        this.wordmap = wordmap;
    }

    public String getNtitle()
    {
        return ntitle;
    }

    public void setNtitle(String ntitle)
    {
        this.ntitle = ntitle;
    }

    public List<UserUp> getWordlist()
    {
        return wordlist;
    }

    public void setWordlist(List<UserUp> wordlist)
    {
        this.wordlist = wordlist;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getCnum() {
        return cnum;
    }

    public void setCnum(String cnum) {
        this.cnum = cnum;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Map<String, Object> getUsermap() {
        return usermap;
    }

    public void setUsermap(Map<String, Object> usermap) {
        this.usermap = usermap;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getFtime() {
        return ftime;
    }

    public void setFtime(String ftime) {
        this.ftime = ftime;
    }

    public String getLtime() {
        return ltime;
    }

    public void setLtime(String ltime) {
        this.ltime = ltime;
    }

    public List<UserList> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<UserList> userlist) {
        this.userlist = userlist;
    }


}
