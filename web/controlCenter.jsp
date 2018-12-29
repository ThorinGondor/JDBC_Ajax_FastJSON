<%--
  Created by IntelliJ IDEA.
  User: LiXinze
  Date: 2018/12/27
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ControlCenter</title>
</head>
<body>
    <p><input type="button" onclick="initTopics()" value="显示新闻"></p>
</body>
<script type="text/javascript" src="jquery/jquery-3.2.1.js"></script>
<script type="text/javascript">
    function initTopics() {
        $.ajax({
            "url": "TopicServlet",
            "type": "GET",
            "data": "opr=list",
            "dataType": "json",
            "error": function () {
                alert("响应失败！");
            },
            "success": function () {
                alert("响应成功！");
            }
        });
    }
</script>
</html>
