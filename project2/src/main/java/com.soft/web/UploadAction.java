package com.soft.web;

import com.opensymphony.xwork2.ActionSupport;
import com.soft.biz.UserBiz;
import com.soft.biz.UserBizImpl;
import com.soft.entity.User;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;
@Controller
public class UploadAction extends ActionSupport {
    private File uploadImage;
    private String uploadImageContentType;
    private String uploadImageFileName;
    private User user;
    @Resource
    private UserBiz adminBizImpl;
    public String execute()
    {
        String realPath= ServletActionContext.getServletContext().getRealPath("/upload");
        File file=new File(realPath);
        String filepath=file.getPath()+"\\"+uploadImageFileName;
        user.setUserimage(filepath);
        Date date=new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        user.setUsertime(dateFormat.format(date));
        if (!file.exists()){
            file.mkdirs();
        }

        try {
            FileUtils.copyFile(uploadImage,new File(file,uploadImageFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean flag=adminBizImpl.addUser(user);
        String msg="no";
        if(flag)
        {
             msg="ok";
        }
        return msg;
    }

    public File getUploadImage() {
        return uploadImage;
    }

    public void setUploadImage(File uploadImage) {
        this.uploadImage = uploadImage;
    }

    public String getUploadImageContentType() {
        return uploadImageContentType;
    }

    public void setUploadImageContentType(String uploadImageContentType) {
        this.uploadImageContentType = uploadImageContentType;
    }

    public String getUploadImageFileName() {
        return uploadImageFileName;
    }

    public void setUploadImageFileName(String uploadImageFileName) {
        this.uploadImageFileName = uploadImageFileName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
