package com.bo.listener;
import com.bo.entity.Book;

import com.bo.entity.User;
import com.sun.org.glassfish.gmbal.Description;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
*@ClassName ContextLoaderListener
*@Description  上下文加载监听，在服务器启动的时候即刻生效，用来生成用户数据和图书数据
*@author crj
*Data 
*@Version 1.0
**/
@WebListener
public class ContextLoaderListener implements ServletContextListener {
    /**
     *  @Description 容器初始化方法
      */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("容器启动");
        //创建并生成用户数据列表
        List<User> userList = new ArrayList<>(2);
        User[] users = {
                new User(1,"Scui","b706835de79a2b4e80506f582af3676a","此间少年" ,"user1.jpg","江苏南京", LocalDate.of(2019,8,20)),
                new User(2,"Orange","b706835de79a2b4e80506f582af3676a","赚钱养仙童" ,"user2.jpg","安徽蚌埠", LocalDate.of(2016,9,20))

        };
        userList = Arrays.asList(users);
        //创建并生成图书数据列表
        List<Book> bookList = new ArrayList<>(3);
        Book[] books={
                new Book(1,"漫长的婚约","book1.jpg","[法] 塞巴斯蒂安"),
                new Book(2,"庸人自扰","book2.jpg","[英]戴伦•麦加维"),
                new Book(3, "绿山墙的安妮", "book3.jpg", "[美]理查德·耶茨")
        };
        bookList = Arrays.asList(books);

        //创建并生成漫画数据列表
      //  List<Comic> comicList = new ArrayList<>(3);
       // Comic[] comics = {
        //        new Comic(1,"怦然心动","comic1.jpg","*kid岁"),
          //      new Comic(2,"杏林芳华","comic2.jpg","听风"),
          //      new Comic(3,"狐冥之乡","comic.jpg","纳骨，薄川酒酒子")
       // };
       // comicList = Arrays.asList(comics);
        //获得全局变量
        ServletContext servletContext = sce.getServletContext();
        //设置全局变量属性，将用户和图书列表数据记入，整个应用可以共享
        servletContext.setAttribute("userList",userList);
        servletContext.setAttribute("bookList",bookList);
       // servletContext.setAttribute("comicList",comicList);
    }

    /**
     * @Description 销毁方法
     * @param sce
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
      System.out.println("容器销毁");
    }
}
