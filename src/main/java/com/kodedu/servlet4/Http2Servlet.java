package com.kodedu.servlet4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.PushBuilder;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by usta on 12.02.2017.
 */
@WebServlet(value = {"/http2"})
public class Http2Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PushBuilder pushBuilder = req.newPushBuilder();
        pushBuilder
                .path("images/kodedu-logo.png")
                .addHeader("content-type", "image/png")
                .push();

        try(PrintWriter respWriter = resp.getWriter();){
            respWriter.write("<html>" +
                    "<img src='images/kodedu-logo.png'>" +
                    "</html>");
        }

    }
}
