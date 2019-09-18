<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html  class="x-admin-sm">
<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
    <base href="<%=basePath%>">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
	<meta charset="UTF-8">
	<title>后台登录</title>
<%--	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />--%>
    <link rel="stylesheet" href="<%=basePath%>adminjsp/css/font.css">
    <link rel="stylesheet" href="<%=basePath%>adminjsp/css/login.css">
	  <link rel="stylesheet" href="<%=basePath%>adminjsp/css/xadmin.css">
    <script type="text/javascript" src="<%=basePath%>adminjsp/js/jquery.min.js"></script>
    <script src="<%=basePath%>adminjsp/lib/layui/layui.js" charset="utf-8"></script>
</head>
<body class="login-bg">
    
    <div class="login layui-anim layui-anim-up">
        <div class="message">后台管理登录</div>
        <div id="darkbannerwrap"></div>
        
        <form method="post" class="layui-form" action="demo/execute.action" >
            <input name="adminid" placeholder="用户名"  type="text" lay-verify="required" class="layui-input" >
            <hr class="hr15">
            <input name="adminpwd" lay-verify="required" placeholder="密码"  type="password" class="layui-input">
            <hr class="hr15">
            <input value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit">
            <hr class="hr20" >
        </form>
    </div>

<%--    <script>
        $(function  () {
            layui.use('form', function(){
              var form = layui.form;
              //监听提交
              form.on('submit(login)', function(data){
                // alert(888)
                layer.msg(JSON.stringify(data.field),function(){
                    location.href='<%=path%>'
                });
                return false;
              });
            });
        })
    </script>--%>
    <!-- 底部结束 -->
</body>
</html>