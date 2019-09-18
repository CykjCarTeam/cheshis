<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html class="x-admin-sm">

<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    %>
    <meta charset="UTF-8">
    <title></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="stylesheet" href="<%=basePath%>adminjsp/css/font.css">
    <link rel="stylesheet" href="<%=basePath%>adminjsp/css/xadmin.css">
    <script src="<%=basePath%>adminjsp/js/jquery.min.js"></script>
    <script src="<%=basePath%>adminjsp/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="<%=basePath%>adminjsp/js/xadmin.js"></script>

</head>

<body>
<div class="layui-fluid">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md12">
            <div class="layui-card">
                <div class="demoTable">

                        <div class="layui-inline">
                            <input id="ftime" name="ftime" type="date" class="layui-input" autocomplete="off">
                        </div>
                        <div class="layui-inline">
                            <input id="ltime" name="ltime" type="date" class="layui-input" autocomplete="off"></div>
                        <div class="layui-inline ">
                            <input type="text" id="userid" name="userid" placeholder="请输入用户名" autocomplete="off"
                                   class="layui-input"  ></div>
                        <div class="layui-inline">
                            <button class="layui-btn"  data-type="reload">查询</button>
                        </div>

                </div>
                <div class="layui-card-body" align="center" >
                    <table class="layui-table" lay-filter="test" id="utable" align="center">
                    </table>
                </div>
                <div hidden="hidden" id="btn">
                    <button id="btn1"  class='layui-btn'></button>
                    <button class="layui-btn">删除</button>
                </div>
            </div>
        </div>
    </div>
</div>
</body>

<script>
    layui.use('laydate', function () {
            var laydate = layui.laydate;

            //执行一个laydate实例
            laydate.render({
                elem: '#start' //指定元素
            });

            //执行一个laydate实例
            laydate.render({
                elem: '#end' //指定元素
            });

        });
</script>
<script>
    // layui.use('table', function () {
    //         var table = layui.table;

            //监听单元格编辑
            /*table.on('edit(test)',
            function(obj) {
                var value = obj.value //得到修改后的值
                ,
                data = obj.data //得到所在行所有键值
                ,
                field = obj.field; //得到字段
                layer.msg('[ID: ' + data.id + '] ' + field + ' 字段更改为：' + value);
            });*/
        // });
</script>
<script src="<%=basePath%>adminjsp/lib/layui/layui.js"></script>
<script>
    layui.use('table', function() {
        var table = layui.table;

        table.render({
            elem: '#utable'
            , height: 600
            , url: '<%=basePath%>admin/find.action' //数据接口
            , page: true //开启分页
            , limit:10
            , id: 'testReload'
            , parseData: function (res) {

                console.log("返回值" + res);
                console.log("状态码" + res.code);
                // console.log("消息" + res.msg);
                console.log("条数" + res.count);
                console.log("数据" + res.data);
                $.each(res.data,function (i,obj) {
                    var  stateid=obj.stateid;
                    if(stateid==5)
                    {
                        $("#btn1").html(
                            // 禁用
                            "禁用"
                        )
                    }else if(stateid==4){
                        $("#btn1").html(
                            "启用"
                            // 启用
                        )
                    }
                })
                 
                return {
                    "code": eval(res.code), //解析接口状态
                    // "msg": res.msg, //解析提示文本
                    "count": res.count, //解析数据长度
                    "data": res.data//解析数据列表
                };
            }
            , cols: [[ //表头
                {field: 'userid', title: '用户名', minWidth: 100}
                , {field: 'usertime', title: '注册时间', minWidth:150}
                , {field: 'userjf', title: '积分', minWidth: 80}
                , {field: 'userupnum', title: '上传文档数', minWidth: 80}
                , {field: 'userdownnum', title: '下载文档数', minWidth: 80}
                , {field: 'statename', title: '用户状态', minWidth: 80}
                , {field: 'userid', title: '操作', minWidth: 80,toolbar:'#btn'}
            ]]
        });
    //触发查询按钮
    var $ = layui.$, active = {
        reload: function(){
            var userid = $('#userid');
            var ftime=$('#ftime');
            var ltime=$('#ltime');
            //执行重载
            table.reload('testReload', {
                page: {
                    curr: 1 //重新从第 1 页开始
                }
                ,where: {
                    userid: userid.val(),
                    ftime:ftime.val(),
                    ltime:ltime.val(),

                }
            }, 'data');
        }
    };

    $('.demoTable .layui-btn').on('click', function(){
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    })
    });

</script>

</html>