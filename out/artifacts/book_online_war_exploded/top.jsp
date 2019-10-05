<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/10/1
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.bo.entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    User user = (User) session.getAttribute("user");
    pageContext.setAttribute("user",user);

%>

<ul>
    <li>
        <a href="${pageContext.request.contextPath}/index">发现音乐</a>
    </li>
    <li>
        <a href="#">我的音乐</a>
    </li>
    <li>
        <a href="#">朋友</a>
    </li>
    <li>
        <a href="#">商城</a>
    </li>
    <li>
        <a href="#">音乐人</a>
    </li>

    <li>
        <a href="#">创造者</a>
    </li>

</ul>


<%--搜索栏--%>
<div id="search">



    <input type="text" placeholder="音乐/视频/电台/用户" class="search-input">
    <div class="search-btn">
        <img border="0" src="images/search.png" width="20" height="20" alt="">

    </div>
</div>


<ul>
    <%--根据user是否为空，显示不同内容--%>
    <%
        if(user!=null){
    %>
    <li>
        <a href="${pageContext.request.contextPath}/user">
            <img  src="${pageContext.request.contextPath}/images/${user.avatar}" alt=""  width="30" height="30" class="avatar">
        </a>
    </li>

    <li>
        <a href="${pageContext.request.contextPath}/logout">退出</a>
    </li>
    <%
        }else {
    %>
    <a href="${pageContext.request.contextPath}/login">登陆</a>
    <%
        }
    %>
</ul>