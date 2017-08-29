package com.readlearncode.servlet4.pushbuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@WebServlet("/imageServlet")
public class ImageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String queryString = request.getQueryString();

        String token = queryString.split("=")[1];

        if (token.equals("coffee-cup")) {
            getServletContext().getRequestDispatcher("/images/coffee-cup.jpg").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/images/ThumbsUpDuke.jpeg").forward(request, response);

        }


    }

}