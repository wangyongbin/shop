package com.wyb.shop.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 2018-09-29 17:06
 */
public class HelloWorld extends HttpServlet {

    private String message = "Hello World !!!";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 设置响应内容类型
        resp.setContentType("text/html");

        // 实际的逻辑是在这里
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + message + "</h1>");

    }


}
