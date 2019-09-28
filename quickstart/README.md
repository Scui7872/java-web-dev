# quickstart起步模块
## 1.简单的登录
- login.html登录页面输入用户名和密码，通过表单发起请求
![Picture1](https://github.com/Scui7872/java-web-dev/blob/master/quickstart/src/images/1.jpg)

- LoginServlet拦截到"/login"请求，判断用户名和密码是否匹配，是就将用户名记入session，跳转到index.jsp，否则继续跳回登录页
![Picture2](https://github.com/Scui7872/java-web-dev/blob/master/quickstart/src/images/2.jpg)
