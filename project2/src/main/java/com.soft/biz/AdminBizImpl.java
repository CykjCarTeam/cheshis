package com.soft.biz;

import com.soft.dao.AdminDao;
import com.soft.dao.AdminDaoImpl;
import com.soft.entity.Admin;
import com.soft.entity.UserList;
import com.soft.entity.UserUp;
import com.soft.mapper.AdminMapper;
import com.soft.mapper.WordMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service("adminBiz")
public class AdminBizImpl implements AdminBiz {
    private AdminDao adminDao=new AdminDaoImpl();
    @Resource
    private AdminMapper adminMapper;
    @Resource
    private WordMapper wordMapper;
    @Override
    public Admin login(Admin admin) {

        return adminMapper.login(admin);
    }

    @Override
    public List<UserList> finduserlist(String userid, String page, String ftime, String ltime,int limit) {
        Map<String,Object> umap=new HashMap<String, Object>();
        int start=(Integer.parseInt(page)-1)*limit;
        int end=limit;
        umap.put("userid",userid);
        umap.put("page",page);
        umap.put("ftime",ftime);
        umap.put("ltime",ltime);
        umap.put("start",start);
        umap.put("end",end);
        return adminMapper.finduserlist(umap);
    }

    @Override
    public int pagecount(String userid, String page, String ftime, String ltime) {
        int count=0;
        Map<String,Object> umap=new HashMap<String, Object>();
        umap.put("userid",userid);
        umap.put("page",page);
        umap.put("ftime",ftime);
        umap.put("ltime",ltime);
        count=adminMapper.finduserpage(umap).size();
        return count;
    }

    @Override
    public boolean upustate(String userid,String stateid) {
        return adminDao.upustate(userid,stateid);
    }

    @Override
    public boolean upupwd(String userid) {
        return adminDao.upupwd(userid);
    }

    @Override
    public boolean adduser(UserList user) {
        return adminDao.adduser(user);
    }

    @Override
    public List<UserUp> findword(String userid, String title, String page, String ftime, String ltime, int limit)
    {
        Map<String,Object> map=new HashMap<String, Object>();
        int start=(Integer.parseInt(page)-1)*limit;
        int end=limit;
        map.put("userid",userid);
        map.put("title",title);
        map.put("page",page);
        map.put("ftime",ftime);
        map.put("ltime",ltime);
        map.put("start",start);
        map.put("end",end);
        return wordMapper.findword(map);
    }

    @Override
    public int wordpage(String userid, String title, String page, String ftime, String ltime)
    {
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("userid",userid);
        map.put("title",title);
        map.put("page",page);
        map.put("ftime",ftime);
        map.put("ltime",ltime);
        List<UserUp> list= wordMapper.wordpage(map);
        int count=list.size();
        return count;
    }


}
