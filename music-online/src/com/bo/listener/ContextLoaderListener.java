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
        List<Book> bookList = new ArrayList<>(9);
        Book[] books={
                new Book(1,"[VIP专享] 一周新歌推荐","music1.jpg","每周VIP专享歌曲，编辑精选推荐。开通网易云音乐会员，即可畅享千万付费歌曲试听下载特权和无损音质"),
                new Book(2,"Nostalgia 70s | 萧条中找寻光明","music2.jpg","这个世界永远比你想的要更加精彩，不要败给生活"),
                new Book(3, "[韩]可爱大宝藏~挖到赚到、消散烦恼", "music3.jpg", "生活不易，但坚持下来的一定很酷"),
                new Book(4,"你若成风（cover许嵩）","music4.jpg","愿你出走半生，归来仍是少年"),
                new Book(5," 京剧电音的诞生之路","music5.jpg","民族采样+古文化与电流的交汇融合。跌宕不失儒雅"),
                new Book(6, "要长大，不要悲伤", "music6.jpg", "以前听歌 听的是旋律 后来听歌 听的是歌词 再后来听歌 听的是故事 现在听的歌 听的是自己 初闻不知曲中意 再听已是曲中人"),
                new Book(7,"民谣是一个悠长的故事","music7.jpg","愿你的冬天永远不缺暖阳，愿你的明天不再经历雨打风霜，愿你的未来永远热泪盈眶"),
                new Book(8,"【纯音乐】睡觉、安静、解压必备","music8.jpg","让歌声带走你的疲惫"),
                new Book(9, "[欧美私人订制] 最懂你的欧美日推", "music9.jpg", "最懂你的欧美日推")





        };
        bookList = Arrays.asList(books);



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
