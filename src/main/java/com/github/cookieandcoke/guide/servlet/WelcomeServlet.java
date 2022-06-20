package com.github.cookieandcoke.guide.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name") == null ? "Anonymous" : req.getParameter("name");
        req.setAttribute("name", name);
        req.getRequestDispatcher("/welcome.jsp").forward(req, resp);
    }
}
