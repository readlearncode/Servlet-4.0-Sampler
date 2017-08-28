package com.readlearncode.servlet4.mapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
//@WebServlet({"/path/*", "*.ext", "", "/", "/exact"})
public class MappingServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpServletMapping mapping = request.getHttpServletMapping();

        System.out.println(mapping);
        System.out.println(mapping.getMappingMatch());

        response.getWriter()
                .append("Mapping match:")
                .append(mapping.getMappingMatch().name())
                .append("\n")
                .append("Match value:")
                .append(mapping.getMatchValue())
                .append("\n")
                .append("Pattern:")
                .append(mapping.getPattern());
    }

}