<%--
  Created by IntelliJ IDEA.
  User: wanggq
  Date: 2019/10/25
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" style="text-align:center;border-color:green;border-collapse:collapse;margin:auto">
    <tr>
        <td>用户编号</td>
        <td>用户姓名</td>
        <td>用户密码</td>

    </tr>
    <tr th:each="user : ${list}">
        <td th:text=${user.id}></td>
        <td th:text=${user.name}></td>
        <td th:text=${user.pwd}></td>

    </tr>
</table>

</body>
</html>
