package com.readlearncode.servlet4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.PushBuilder;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@WebServlet(value = {"/example1"})
public class Example1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PushBuilder pushBuilder = req.newPushBuilder();
        if (pushBuilder != null) {
            pushBuilder
                    .path("images/ThumbsUpDuke.jpeg")
                    .setHeader("content-type", "image/png")
                    .setHeader("cache-control", "public")
                    .push();
        }

        try (PrintWriter respWriter = resp.getWriter()) {
            respWriter.write("<html>" +
                    "<img src='images/ThumbsUpDuke.jpeg'>" +
                    "<br/>DONE!" +
                    "</html>");
        }

    }
}
