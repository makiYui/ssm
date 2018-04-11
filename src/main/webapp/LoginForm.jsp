<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2018/4/10
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
    <form action="/index/login" method="post">
        <font color="red">${requestScope.message}</font>
        <table>
            <tr>
                <td><label>登录名:</label></td>
                <td><input type="text" id="name" name="name"></td>
            </tr>
            <tr>
                <td><label>密码:</label></td>
                <td><input type="text" id="password" name="password"></td>
            </tr>
            <tr>
                <td><input type="submit" value="登录"></td>
            </tr>
        </table>
    </form>
</body>
</html>
