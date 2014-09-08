package com.lycos.jetty;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import com.lycos.jetty.servlet.HelloWorldServlet;

/**
 * @ClassName: HelloWorldServer
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Lycos
 * @date 2014年9月7日 下午6:42:47
 */
public class HelloWorldServer {
    public static void main(String[] args) {
        Server server = new Server();
        SelectChannelConnector connector = new SelectChannelConnector();
        connector.setPort(10018);
        server.setConnectors(new Connector[] { connector });

        ServletContextHandler ctx = new ServletContextHandler(ServletContextHandler.SESSIONS);
        ctx.setContextPath("/");
        ctx.addServlet(new ServletHolder(new HelloWorldServlet()), "/hello");
        ctx.addServlet(new ServletHolder(new DefaultServlet()), "/");

        server.setHandler(ctx);
        try {
            server.start();
            server.join();
        } catch (Exception e) {
        }
    }
}
