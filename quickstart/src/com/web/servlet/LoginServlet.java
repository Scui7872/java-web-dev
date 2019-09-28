package com.web.servlet;

import com.web.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        String username = req.getParameter("username");

        String password = req.getParameter("password");

        System.out.println(username);

        LoginService loginService = new LoginService();
        boolean flag = loginService.isLogin(username,password);
        if (flag){
            HttpSession session =req.getSession();
            String sessionId = session.getId();
            session.setAttribute("username",username                        );
            resp.sendRedirect("index.jsp");
        }else{
            PrintWriter out = resp.getWriter();
            out.println("<script>alert('login failure')</script>");
            resp.sendRedirect("/");
        }

    }}