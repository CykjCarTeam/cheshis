<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        String path = request.getContextPath() + "/";
    %>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>
    <!--[if IE]>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <![endif]-->
    <title>Free Responsive Admin Theme - ZONTAL</title>
    <!-- BOOTSTRAP CORE STYLE  -->
    <link href="<%=path%>userjsp/assets/css/bootstrap.css" rel="stylesheet"/>
    <!-- FONT AWESOME ICONS  -->
    <link href="<%=path%>userjsp/assets/css/font-awesome.css" rel="stylesheet"/>
    <!-- CUSTOM STYLE  -->
    <link href="<%=path%>userjsp/assets/css/style.css" rel="stylesheet"/>
</head>
<body>
<header>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <strong></strong>欢迎进入
                &nbsp;&nbsp;
                <strong></strong>文档管理系统
            </div>

        </div>
    </div>
</header>
<!-- HEADER END-->
<div class="navbar navbar-inverse set-radius-zero">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand">

                <img src="<%=path%>userjsp/assets/img/logo2.png"/>
            </a>

        </div>

        <div class="left-div">
            <i class="fa fa-user-plus login-icon"></i>
        </div>
    </div>
</div>
<!-- LOGO HEADER END-->

<!-- MENU SECTION END-->
<div class="content-wrapper">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h4 class="page-head-line">注册 </h4>

            </div>

        </div>
        <div class="row">
            <div class="col-md-6">
                <form id="resform" action="<%=path%>upfile/uploads.action" onsubmit="return aa()" method="post" enctype="multipart/form-data">
                    <h4><br/>
                        <label>用户名 : </label>
                        <input id="userid" name="user.userid" type="text" class="form-control"/><span style="color: #ac2925" id="yhm"></span><br/>
                        <label>密码 : </label>
                        <input id="pwd" name="user.userpwd" type="password" class="form-control"/><span style="color: #ac2925" id="mima"></span><br/>
                        <label>确认密码 : </label>
                        <input id="pwd2" type="password" class="form-control"/>
                        <label>性别 : </label>
                        <input name="user.usersex" type="radio"  value="男" checked="checked"/>男
                        <input name="user.usersex" type="radio"  value="女"/>女<br/>
                        <label>学历 : </label>
                        <select name="user.userxl">
                            <option value="大专">大专</option>
                            <option value="大专">本科</option>
                            <option value="博士">博士</option>
                            <option value="硕士">硕士</option>
                        </select><br/>
                        <label>职业：</label>
                        <input id="userjob" name="user.userjob" type="text" class="form-control"/><span style="color: #ac2925" id="ujob"></span><br/>
                        <label>联系电话：</label>
                        <input id="userphone" name="user.userphone" type="text" class="form-control"/><span style="color: #ac2925" id="phonets"></span><br/>
                        <label>联系地址：</label>
                        <input id="useraddress" name="user.useraddress" type="text" class="form-control"/><span style="color: #ac2925" id="adressts"></span><br/>
                        <label>头像：</label>
                        <input id="file"  type="file" name="uploadImage" /><span style="color: #ac2925" id="files"></span><br/>
                    </h4>
                    <hr/>
                    <input type="submit" class="btn btn-info" value="提交">
                    <a href="<%=path%>userjsp/login.jsp" class="btn btn-info">返回</a>
                </form>
            </div>
        </div>
    </div>
</div>
<!-- CONTENT-WRAPPER SECTION END-->
<footer>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                &copy; 2015 YourCompany | By : <a href="" target="_blank">DesignBootstrap</a>
            </div>

        </div>
    </div>
</footer>
<!-- FOOTER SECTION END-->
<!-- JAVASCRIPT AT THE BOTTOM TO REDUCE THE LOADING TIME  -->
<!-- CORE JQUERY SCRIPTS -->
<script src="<%=path%>userjsp/assets/js/jquery-1.11.1.js"></script>
<!-- BOOTSTRAP SCRIPTS  -->
<script src="<%=path%>userjsp/assets/js/bootstrap.js"></script>
<script src="<%=path%>userjsp/assets/js/res.js"></script>
<script>
    $(document).ready(function(){
        $("#userid").blur(function(){
            var userid=$("#userid").val();
            $.ajax({
                url:"<%=path%>user/userc!check.action?user.userid="+userid,
                type:"POST",
                success:function(redata){
                    var mes="";
                    if(redata==1)
                    {
                        mes="用户名不可用，已存在";
                    }
                    else
                    {
                        mes="用户名可用";
                    }

                    document.getElementById("yhm").innerHTML=mes;
                },

            });
        });
    });
</script>
</body>
</html>
