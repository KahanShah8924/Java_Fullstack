package org.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Authentication extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        if ("abc@gmail.com".equals(email) && "123456".equals(password)) {
            out.println("<h2>Login Successful</h2>");
        } else {
            out.println("<h2>Login Failed</h2>");
        }
    }
}