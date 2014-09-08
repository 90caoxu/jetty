package com.lycos.jetty.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: HelloWorldServlet
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Lycos
 * @date 2014年9月7日 下午6:47:52
 */
public class HelloWorldServlet extends HttpServlet {

    private static final long serialVersionUID = -5058462214362003213L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("utf-8");
        // String sen= request.getParameter("q");
        response.getWriter().println("Hello Baby!");
    }
}
