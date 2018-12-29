<%--
  Created by IntelliJ IDEA.
  User: LiXinze
  Date: 2018/12/27
  Time: 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>LoginPage</title>
  </head>
  <body>
    <form action="GoUserServlet" method="post">
      <P>用户名：<label><input type="text" name="username" required></label></P>
      <p>密  码：<label><input type="password" name="pwd" required></label></p>
      <p><input type="submit" value="点击提交"></p>
    </form>
  </body>
</html>
