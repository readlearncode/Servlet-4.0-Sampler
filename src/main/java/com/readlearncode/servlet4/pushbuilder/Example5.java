package com.readlearncode.servlet4.pushbuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.PushBuilder;
import java.io.IOException;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@WebServlet(value = {"/example5"})
public class Example5 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PushBuilder pushBuilder = request.newPushBuilder();
        if (pushBuilder != null) {
            pushBuilder
                    .queryString("image=coffee-cup")
                    .path("imageServlet")
                    .setHeader("content-type", "image/jpeg")
                    .push();
        }


        getServletContext().getRequestDispatcher("/coffee-cup.jsp").forward(request, response);


//        try (PrintWriter printWriter = response.getWriter()) {
//            printWriter.write("<html><img src='images/coffee-cup.jpg'></html>");
//        }

    }
}
