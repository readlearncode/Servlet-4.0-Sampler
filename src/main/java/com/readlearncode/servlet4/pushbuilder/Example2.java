package com.readlearncode.servlet4.pushbuilder;

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
@WebServlet(value = {"/example2"})
public class Example2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PushBuilder pushBuilder = request.newPushBuilder();
        if (pushBuilder != null) {
            for (int x = 0; x < 20; x++) {
                for (int y = 0; y < 20; y++) {
                    String imageName = "images/ThumbsUpDuke [www.imagesplitter.net]-" + x + "-" + y + ".jpeg";
                    System.out.println(imageName);
                    pushBuilder
                            .path(imageName)
                            .setHeader("content-type", "image/jpeg") // should use set header rather than add header. Limit of 100 headers.
                            .push();
                }
            }
        }

        StringBuilder page = new StringBuilder();
        page.append("<html>");
        for (int x = 0; x < 20; x++) {
            for (int y = 0; y < 20; y++) {
                page.append("<img src='images/ThumbsUpDuke [www.imagesplitter.net]-" + x + "-" + y + ".jpeg'>");
            }
            page.append("<br/>");
        }
        page.append("DONE!");
        page.append("</html>");
        System.out.println(page.toString());

        try (PrintWriter respWriter = response.getWriter()) {
            respWriter.write(page.toString());
        }

    }
}
