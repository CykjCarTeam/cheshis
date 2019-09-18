<%--
  Created by IntelliJ IDEA.
  User: 92090
  Date: 2019/8/21
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html class="x-admin-sm">
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
  <title>文档分享平台</title>
  <meta name="renderer" content="webkit|ie-comp|ie-stand">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="stylesheet" href="<%=basePath%>adminjsp/css/font.css">
  <link rel="stylesheet" href="<%=basePath%>adminjsp/css/xadmin.css">
  <!-- <link rel="stylesheet" href="./css/theme5.css"> -->
  <script src="<%=basePath%>adminjsp/lib/layui/layui.js" charset="utf-8"></script>
  <script type="text/javascript" src="<%=basePath%>adminjsp/js/xadmin.js" charset="utf-8"></script>

  <script>
    // 是否开启刷新记忆tab功能
    // var is_remember = false;
  </script>
</head>
<body class="index">
<!-- 顶部开始 -->
<div class="container">
  <div class="logo">
    <a href="<%=basePath%>/index.jsp">文档分享平台</a></div>
  <div class="left_open">
    <a><i title="展开左侧栏" class="iconfont">&#xe699;</i></a>
  </div>
  <ul class="layui-nav right" lay-filter="">
    <li class="layui-nav-item">
      <a href="javascript:;">
        ${sessionScope.admin.adminname}
          </a>
      <dl class="layui-nav-child">
        <!-- 二级菜单 -->
        <dd>
          <a onclick="xadmin.open('个人信息','http://www.baidu.com')">个人信息</a></dd>
        <dd>
          <a href="<%=basePath%>adminjsp/login.jsp">退出</a></dd>
      </dl>
    </li>
    <li class="layui-nav-item to-index">
      <a href="/">前台首页</a></li>
  </ul>
</div>
<!-- 顶部结束 -->
<!-- 中部开始 -->
<!-- 左侧菜单开始 -->
<div class="left-nav">
  <div id="side-nav">
    <ul id="nav">
      <li>
        <a href="javascript:;">
          <i class="iconfont left-nav-li" lay-tips="hygl">&#xe6b8;</i>
          <cite>用户管理</cite>
          <i class="iconfont nav_right">&#xe697;</i></a>
        <ul class="sub-menu">
          <li>
            <a onclick="xadmin.add_tab('用户查询','<%=basePath%>adminjsp/member-list1.jsp')">

              <i class="iconfont">&#xe6a7;</i>
              <cite>用户查询</cite></a>

          </li>
          <li>
            <a onclick="xadmin.add_tab('用户管控','<%=basePath%>adminjsp/member-list.jsp')">
              <i class="iconfont">&#xe6a7;</i>
              <cite>用户管控</cite></a>
          </li>
        </ul>
      </li>
      <li>
        <a href="javascript:;">
          <i class="iconfont left-nav-li" lay-tips="ddgl">&#xe723;</i>
          <cite>文档管理</cite>
          <i class="iconfont nav_right">&#xe697;</i></a>
        <ul class="sub-menu">
          <li>
            <a onclick="xadmin.add_tab('文档列表','<%=basePath%>adminjsp/word-list.jsp')">
              <i class="iconfont">&#xe6a7;</i>
              <cite>文档列表</cite></a>
          </li>
          <li>
            <a onclick="xadmin.add_tab('文档管控','<%=basePath%>adminjsp/order-list1.jsp')">
              <i class="iconfont">&#xe6a7;</i>
              <cite>文档管控</cite></a>
          </li>
        </ul>
      </li>
      <li>
        <a href="javascript:;">
          <i class="iconfont left-nav-li" lay-tips="分类管理">&#xe723;</i>
          <cite>分类管理</cite>
          <i class="iconfont nav_right">&#xe697;</i></a>
        <ul class="sub-menu">
          <li>
            <a onclick="xadmin.add_tab('多级分类','<%=basePath%>adminjsp/cate.jsp')">
              <i class="iconfont">&#xe6a7;</i>
              <cite>多级分类</cite></a>
          </li>
        </ul>
      </li>
      <li>
        <a href="javascript:;">
          <i class="iconfont left-nav-li" lay-tips="管理员管理">&#xe726;</i>
          <cite>管理员管理</cite>
          <i class="iconfont nav_right">&#xe697;</i></a>
        <ul class="sub-menu">
          <li>
            <a onclick="xadmin.add_tab('管理员列表','<%=basePath%>adminjsp/admin-list.jsp')">
              <i class="iconfont">&#xe6a7;</i>
              <cite>管理员列表</cite></a>
          </li>
          <li>
            <a onclick="xadmin.add_tab('角色管理','<%=basePath%>adminjsp/admin-role.jsp')">
              <i class="iconfont">&#xe6a7;</i>
              <cite>角色管理</cite></a>
          </li>
          <li>
            <a onclick="xadmin.add_tab('权限分类','<%=basePath%>adminjsp/admin-cate.jsp')">
              <i class="iconfont">&#xe6a7;</i>
              <cite>权限分类</cite></a>
          </li>
          <li>
            <a onclick="xadmin.add_tab('权限管理','<%=basePath%>adminjsp/admin-rule.jsp')">
              <i class="iconfont">&#xe6a7;</i>
              <cite>权限管理</cite></a>
          </li>
        </ul>
      </li>
    </ul>
  </div>
</div>
<!-- <div class="x-slide_left"></div> -->
<!-- 左侧菜单结束 -->
<!-- 右侧主体开始 -->
<div class="page-content">
  <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
    <ul class="layui-tab-title">
      <li class="home">
        <i class="layui-icon">&#xe68e;</i>我的桌面</li></ul>
    <div class="layui-unselect layui-form-select layui-form-selected" id="tab_right">
      <dl>
        <dd data-type="this">关闭当前</dd>
        <dd data-type="other">关闭其它</dd>
        <dd data-type="all">关闭全部</dd></dl>
    </div>
    <div class="layui-tab-content">
      <div class="layui-tab-item layui-show">
        <iframe src='<%=basePath%>adminjsp/welcome.jsp' frameborder="0" scrolling="yes"  class="x-iframe"></iframe>
      </div>
    </div>
    <div id="tab_show"></div>
  </div>
</div>
<div class="page-content-bg"></div>
<style id="theme_style"></style>
<!-- 右侧主体结束 -->
<!-- 中部结束 -->

</body>

</html>
