<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: matebook
  Date: 2022/12/12
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>添加用户</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
<%--    <link href="/css/bootstrap.min.css" rel="stylesheet">--%>

    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="${pageContext.request.contextPath}/js/jquery-2.1.0.min.js"></script>
<%--    <script src="js/jquery-2.1.0.min.js"></script>--%>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<%--    <script src="/js/bootstrap.min.js"></script>--%>
</head>
<body>
<div class="container">
    <center><h3>添加员工信息</h3></center>
    <div class="row">
        <div class="col-lg-3"></div>
        <div class="col-lg-6">
            <form action="${pageContext.request.contextPath}/worker/saveWorker" method="post">
                <div class="form-group">
                    <label for="name">姓名：</label>
                    <input type="text" class="form-control" id="name" name="name" placeholder="请输入姓名">
                </div>
                <div class="form-group">
                    <label for="post">职位：</label>
                    <input type="text" class="form-control" id="post" name="post" placeholder="请输入职位">
                </div>
                <div class="form-group">
                    <label for="phone">电话：</label>
                    <input type="text" class="form-control" id="phone" name="phone" placeholder="请输入电话">
                </div>
                <div class="form-group">
                    <label for="dept_id">部门号：</label>
                    <input onchange="checkDeptIdBeforeAdd()" type="number" class="form-control" id="dept_id" name="dept_id" placeholder="请输入部门号">
                    <p id="deptExistMark"></p>
                    <p id="deptInfo"></p>
                </div>
                <div class="form-group">
                    <label for="hiredate">入职时间：</label>
                    <input type="text" class="form-control" id="hiredate" name="hiredate" placeholder="请输入职时间:xxxx-xx-xx">
                </div>

                <div class="form-group" style="text-align: center">
                    <input class="btn btn-primary" type="submit" value="提交" />
                    <input class="btn btn-default" type="reset" value="重置" />
                    <input class="btn btn-default" type="button" onclick="history.go(-1)" value="返回" />
                </div>
            </form>
        </div>
        <div class="col-lg-3"></div>
    </div>
</div>

<script>
    function checkDeptIdBeforeAdd() {
        let data = $("input[name='dept_id']").val();
        let url = '${pageContext.request.contextPath}/dept/findById?id=' + data;
        $.ajax({
            type: 'GET',
            url: url,
            dataType: 'json',
            contentType: 'application/json;charset=utf-8',
            success:function (resp) {
                console.log(resp);
                if (resp.dept_name){
                    $("#deptInfo").text("部门号：" + resp.dept_id + " 部门名称：" + resp.dept_name).show();
                    $("#deptExistMark").hide();
                }else {
                    $("#deptExistMark").text("部门不存在").show();
                    $("deptInfo").hide();
                }
            },
            error:function (xhr, type, errorThrown) {
                console.log("xhr:" + xhr + " type:" + type + " errorThrown:" + errorThrown);
            }
        });

    }
</script>

</body>
</html>
