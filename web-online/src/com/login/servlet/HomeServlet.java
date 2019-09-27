package com.login.servlet;

import com.login.servlet.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.print.Book;
import java.io.IOException;
import java.util.List;

/**
*@ClassName HomeServlet
*@Description  TODO
*@author crj
*Data 
*@Version 1.0
**/
@WebServlet(urlPatterns = "/home")


public class HomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> bookList = BookService.init();
        req.setAttribute("bookList", bookList);
        req.getRequestDispatcher("/home.jsp").forward(req, resp);
    }
}