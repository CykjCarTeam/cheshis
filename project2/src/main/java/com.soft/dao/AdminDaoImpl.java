package com.soft.dao;

import com.soft.entity.Admin;
import com.soft.entity.UserList;
import com.soft.tools.DbHelp;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

public class AdminDaoImpl implements AdminDao {
    private String sql;
    private boolean flag=false;
    @Override
    public Admin findAdminbyAdmin(Admin admin) {
        Admin admin1 = null;
        try {
            sql = "SELECT * FROM tbladmin WHERE adminid=? and adminpwd=?";
            QueryRunner qr = DbHelp.getQueryRunner();
            Object[] params = new Object[]{admin.getAdminid(), admin.getAdminpwd()};
            admin1 = qr.query(sql, params, new BeanHandler<>(Admin.class));
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return admin1;
    }

    @Override
    public List<UserList> userlist(String userid, String page,String ftime,String ltime) {
        List<UserList> adminlist = null;
        int start=(Integer.parseInt(page)-1)*10;
        int end=(Integer.parseInt(page))*10;
        try {
            sql = "SELECT * from(SELECT u.userid,u.userxl,u.useraddress,u.userjf,u.userjob,u.userphone,u.userpwd,u.usersex,u.userstate,u.usertime,u.userdownnum,IFNULL(t1.userupnum,0) userupnum from tbluser u LEFT OUTER JOIN(select userid ,count(*) userupnum from tblmyword GROUP BY userid) t1" +
                    " ON  u.userid=t1.userid )t,tblstate st where 1=1 and t.userstate=st.stateid ";
            if(null!=userid&&!userid.equals(""))
            {
                sql+=" and t.userid='"+userid+"'";
            }
            if((null!=ftime&&!"".equals(ftime))&&(null!=ltime&&!"".equals(ltime)))
            {
                sql+=" and t.usertime between '"+ftime+" 00:00:00' and '"+ltime+" 24:00:00'";
            }
            sql+=" LIMIT "+start+","+end;
            QueryRunner qr = DbHelp.getQueryRunner();
            adminlist = qr.query(sql, new BeanListHandler<>(UserList.class));
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return adminlist;
    }

    @Override
    public int pagecount(String userid, String page, String ftime, String ltime) {
        int count=0;
        try {
            sql = "SELECT count(*) from(SELECT u.userid,u.userxl,u.useraddress,u.userjf,u.userjob,u.userphone,u.userpwd,u.usersex,u.userstate,u.usertime,u.userdownnum,IFNULL(t1.userupnum,0) userupnum from tbluser u LEFT OUTER JOIN(select userid ,count(*) userupnum from tblmyword GROUP BY userid) t1" +
                    " ON  u.userid=t1.userid )t,tblstate st where 1=1 and t.userstate=st.stateid ";
            if(null!=userid&&!userid.equals(""))
            {
                sql+=" and t.userid like '%"+userid+"%'";
            }
            if((null!=ftime&&!"".equals(ftime))&&(null!=ltime&&!"".equals(ltime)))
            {
                sql+=" and t.usertime between '"+ftime+" 00:00:00' and '"+ltime+" 24:00:00'";
            }
            QueryRunner qr = DbHelp.getQueryRunner();
            count = Integer.parseInt(qr.query(sql,new ScalarHandler<>()).toString());
            System.out.println(count);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public boolean upustate(String userid,String stateid) {
        int num=0;
        try {
            sql="UPDATE  tbluser  SET userstate=? where userid=?";
            QueryRunner qr=DbHelp.getQueryRunner();
            Object params=new Object[]{stateid,userid};
            num=qr.update(sql,params,new ScalarHandler<>());
            if (num>0)
            {
                flag=true;
            }else
            {
                flag=false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            flag=false;
        }
        return flag;
    }

    @Override
    public boolean upupwd(String userid) {
        int num=0;
        try {
            sql="UPDATE  tbluser  SET userpwd='123456' where userid=?";
            QueryRunner qr=DbHelp.getQueryRunner();
            Object params=userid;
            num=qr.update(sql,params,new ScalarHandler<>());
            if (num>0)
            {
                flag=true;
            }else
            {
                flag=false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            flag=false;
        }
        return flag;
    }

    @Override
    public boolean adduser(UserList user) {
        int num=0;
        try {
            sql="INSERT INTO tbluser (userid,userpwd,usersex,userxl,userjob,userphone,useraddress,usertime,userimage) VALUES (?,?,?,?,?,?,?,?,?)";
            QueryRunner qr=DbHelp.getQueryRunner();
            Object params=new Object[]{user.getUserid(),user.getUserpwd(),user.getUsersex(),user.getUserxl(),user.getUserjob(),user.getUserphone(),user.getUseraddress(),user.getUsertime(),user.getUserimage()};
            num=qr.update(sql,params,new ScalarHandler<>());
            if (num>0)
            {
                flag=true;
            }else
            {
                flag=false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            flag=false;
        }
        return flag;
    }
}
