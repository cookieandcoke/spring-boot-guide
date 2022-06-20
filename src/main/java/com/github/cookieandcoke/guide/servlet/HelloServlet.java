package com.github.cookieandcoke.guide.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name") == null ? "Anonymous" : req.getParameter("name");
        resp.setStatus(HttpServletResponse.SC_OK);
        resp.getWriter().write("Hello, " + name);
        resp.getWriter().flush();
        resp.getWriter().close();
    }
}
