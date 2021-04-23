//===============================================
package com.pkg.readyapp;
//===============================================
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
//===============================================
public class GMain extends HttpServlet {
    //===============================================
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException,IOException {
        GManager.sGApp lApp = GManager.Instance().getData().app;
        lApp.http_response = response;
        lApp.http_printer = response.getWriter();
        GWidget.Create("home").print();
    }
    //===============================================
}
//===============================================
