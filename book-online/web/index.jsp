<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/9/27
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>
<%@ page import="com.bo.entity.Book" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css">
    <style type="text/css">
      h2,h3{
        color: rgb(73,73,73);
      }
      #search{
        height: 50px;
        background-color: rgb(35, 38, 36);
        display: flex;
        align-items: center;
        padding-left: 8%;
        margin-bottom: 10px;
      }
      .search-input{
        flex: 0 0 40%;
        width: 180px;
        height: 30px;
        background-color: #fff;
        border: none;
        border-radius: 3px;
        margin-left: 200px;
      }
      .search-btn{
        width: 70px;
        height: 50px;
        background-color: rgb(35, 40, 38);
        display: flex;
        align-items: center;
        margin-right: 80px;

      }
      .search-btn img{
        width: 50%;
        height: 50%;
      }
      .card{
        height: 180px;
        margin: 20px 5px 20px 5px;
      }
      .card img{
        width: 100%;
        height: 90%;
      }
      .card p{
        font-size: 13px;
        color: rgb(35, 38, 36);
      }
      .col-4 img{
        margin: 10px 5px 20px 5px;
        width: 80%;
      }
      hr{
        width: 90%;
        color: #eee;
        margin-top: 10px;
      }


    </style>
  </head>
  <body>
  <%
    List<Book> bookList = (List<Book>) request.getAttribute("bookList");
  %>

  <%--使用jsp的include动作，将top.jsp页面包含进来，顶部导航共享在各个页面--%>
  <div id="top">
    <jsp:include page="top.jsp"/>
  </div>



  <%--主体内容区--%>
  <div class="container">
    <div class="row">
      <%--左侧2/3主体部分--%>
      <div class="col-8">
        <h3>热门推荐   华语   流行   民谣  电子   更多</h3>
        <hr>
        <div class="row">


          <%--遍历图书数据集合，将每个图书对象放入页面--%>
          <%
            for (Book book:bookList){
              pageContext.setAttribute("book",book);

          %>



        <div class="col-2 card">
          <%--点击每本图书封面图，地址栏跳转为/detail/id,进入图书详情Servlet--%>
          <a href="${pageContext.request.contextPath}/detail/${book.id}">
            <img src="images/${book.cover}" alt="">
          </a>
          <p style="color: rgb(51,119,178)">${book.name}</p>
        </div>
        <%
          }
        %>
    </div>


      <h4>新碟上架</h4>
        <hr>



</div>

        <div class="col-4">
          <h3>入驻歌手</h3>
          <hr>
          <img src="images/right2.jpg" alt="">
        </div>
    </div>


    <footer>
      <ul>
        <li>服务条款</li>
        <li>隐私政策</li>
        <li>儿童隐私政策</li>
        <li>版权投诉指引</li>
        <li>意见反馈</li>

      </ul>
      <ul>
        <li>联系我们</li>
        <li>帮助中心</li>
        <li>法律声明</li>
        <li>举报邮箱：****</li>
      </ul>
    </footer>
  </div>

  </body>
</html>
