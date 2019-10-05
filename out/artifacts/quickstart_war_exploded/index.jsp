<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/9/27
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>首页</title>
</head>
<body>
<h2>欢迎您
  <%=session.getAttribute("username")%>
  <%-- <%=request.getAttribute("username")%>--%>
</h2>
</body>
</html>
