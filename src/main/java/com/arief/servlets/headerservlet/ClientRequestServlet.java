package com.arief.servlets.headerservlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Date;

/**
 * Created by Arief on 9/8/2017.
 */
public class ClientRequestServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.addCookie(new Cookie("admin","arief"));

        resp.setContentType("text/html");


        PrintWriter writer  = resp.getWriter();



        writer.write(
                "<html>" +
                        "<head></head>" +
                        "" +
                        "<body>" +
                        "" +
                        "<a href = '/arief/client/request-header'>" +
                        "go to requestHeaderServlet class" +
                        "</a>" +
                        "" +
                        "</body>" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "</html>"
        );

    }


}
