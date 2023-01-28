<%--
  Created by IntelliJ IDEA.
  User: matebook
  Date: 2022/12/20
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script src="${pageContext.request.contextPath}/js/jquery-3.5.1.js"></script>

<button id="btn1">ajax异步提交</button>
<script>
    $("#btn1").click(function () {
        let url = '${pageContext.request.contextPath}/worker/ajaxRequest';
        let data = '';
        $.ajax({
            type: 'POST',
            url: url,
            data: data,
            contentType: 'application/json;charset=utf-8',
            success: function (resp) {
alert(JSON.stringify(resp))
            }
        })
    })
</script>

</body>


</html>
