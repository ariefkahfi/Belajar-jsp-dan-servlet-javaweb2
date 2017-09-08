package com.arief.servlets.forms;

import com.arief.entity.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Arief on 9/8/2017.
 */
public class SubmitFormPersonServlet extends HttpServlet {




    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html");


       int id = Integer.parseInt(req.getParameter("id"));
       String nama = req.getParameter("nama");


       PrintWriter writer = resp.getWriter();


       StringBuilder html = new StringBuilder();


       html.append("<html>");

       html.append("<head>" +
               "" +
               "<title>" +
               "</title>" +
               "" +
               "" +
               "</head>");

       html.append("<body>" +
               "" +
               "<div>Hello World , "+ new Person(id,nama).toString()+
               "</div>" +
               "<a href= '/arief/person/form.jsp'>" +
               "Back to Form" +
               "</a>" +
               "" +
               "</body>");

       html.append("</html>");

       writer.write(html.toString());

    }
}
