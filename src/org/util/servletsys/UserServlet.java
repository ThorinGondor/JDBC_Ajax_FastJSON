package org.util.servletsys;

import java.io.IOException;

public class UserServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("进入doPost()流程！");
        request.setCharacterEncoding("UTF-8");
        this.doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("进入doGet()流程！");
        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");

        boolean logStatus = false;

        if(username.equals("ThorinGondor") && pwd.equals("9647")){
            logStatus = true;
            request.setAttribute("logStatus",logStatus);
            request.getRequestDispatcher("controlCenter.jsp").forward(request,response);
        }
        else {
            logStatus = false;
            request.setAttribute("logStatus",logStatus);
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
    }
}
