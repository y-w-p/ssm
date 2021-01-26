<%--
  Created by IntelliJ IDEA.
  User: 喻伟平
  Date: 2021/1/25
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/findAll">测试</a>

    <h3>测试保存</h3>
    <form action="account/save" method="post">
        姓名：<input type="text" name="name"/></br>
        金额：<input type="text" name="money"/></br>
        <input type="submit"  value="提交"/>
    </form>

</body>
</html>
