package com.arief.servlets.headerservlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by Arief on 9/8/2017.
 */
public class RequestHeaderServletExample extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        Enumeration<String> headers = req.getHeaderNames();


        PrintWriter writer = resp.getWriter();



        writer.write("<html>" +
                "" +
                "<head></head>" +
                "" +
                "<body>" +
                "" +
                "<table border = '2' >");

        int i = 0;

        while (headers.hasMoreElements()){
           String headersName = headers.nextElement();
           String value = req.getHeader(headersName);


           writer.write("" +
                   "<tr>" +
                   "<td>" +headersName+"</td>" +
                   "<td>" +value+"</td>" +
                   "</tr>" +
                   "" +
                   "" +
                   "");

        }
        writer.write("" +
                "" +
                "</table>" +
                "" +
                "</body>");
        writer.write("</html>");
    }
}
