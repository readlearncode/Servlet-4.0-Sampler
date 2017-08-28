package com.readlearncode.servlet4;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@WebFilter("/PushBuilderFilter")
public class PushBuilderFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        ((HttpServletRequest)request).newPushBuilder()
//                .path("images/ThumbsUpDuke.jpeg")
//                .setHeader("content-type", "image/jpeg")
//                .setHeader("cache-control", "public")
//                .push();
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}