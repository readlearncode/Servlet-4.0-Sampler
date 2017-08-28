package com.readlearncode.servlet4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@WebServlet(value = {"/example4"})
public class Example4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(() ->
                req.newPushBuilder()
                        .path("images/ThumbsUpDuke.jpeg")
                        .setHeader("content-type", "image/jpeg")
                        .push()
        );


        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try (PrintWriter respWriter = resp.getWriter()) {
            respWriter.write("<html>" +
                    "<img src='images/ThumbsUpDuke.jpeg'>" +
                    "</html>");
           // respWriter.flush();
        }

        executorService.shutdown();
    }
}
