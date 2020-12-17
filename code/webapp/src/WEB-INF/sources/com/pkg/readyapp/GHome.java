//===============================================
package com.pkg.readyapp;
//===============================================
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
//===============================================
public class GHome extends HttpServlet {
    //===============================================
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException,IOException {
        GManager.sGApp lApp = GManager.Instance().getData().app;
        lApp.http_response = response;
        lApp.http_printer = response.getWriter();
        
        GWidget.Create("header").print();
        GWidget.Create("body").print();
        GWidget.Create("footer").print();
        lApp.http_printer.println("</body></html>");
    }
    //===============================================
}
//===============================================
