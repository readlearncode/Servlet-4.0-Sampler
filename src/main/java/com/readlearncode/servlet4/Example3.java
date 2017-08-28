package com.readlearncode.servlet4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@WebServlet(value = {"/example3"})
public class Example3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try (PrintWriter respWriter = resp.getWriter()) {

            respWriter.write("<html>");
            for (int x = 0; x < 20; x++) {
                for (int y = 0; y < 20; y++) {
                    respWriter.write("<img src='images/ThumbsUpDuke [www.imagesplitter.net]-" + x + "-" + y + ".jpeg'>");
                }
                respWriter.write("<br/>");
            }
            respWriter.write("DONE!");
            respWriter.write("</html>");
        }

    }
}
