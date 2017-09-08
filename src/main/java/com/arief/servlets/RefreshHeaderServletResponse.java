package com.arief.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Arief on 9/8/2017.
 */
public class RefreshHeaderServletResponse extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp) throws ServletException,
            IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();


        StringBuilder html = new StringBuilder();

        html.append("<html>");
        html.append("<head>" +
                "" +
                "<title>This is refresh header servlet</title>" +
                "" +
                "</head>");

        html.append("<body>" +
                "" +
                "" +
                "<h2 style='font-weight:bold; background-color:crimson;'>" +
                "This page will refresh in 5 seconds :)</h2>" +
                "" +
                "" +
                "</body>");

        html.append("</html>");


        writer.write(html.toString());

        resp.setHeader("refresh","5; URL=/arief/headers-test/RefreshedPage.html");
    }


}
