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
        response.setContentType("text/html");
        PrintWriter lPrintWriter = response.getWriter();
        lPrintWriter.println("<html>");
        lPrintWriter.println("<head><title>Accueil</title></title>");
        lPrintWriter.println("<body>");
        lPrintWriter.println("<h1>Bonjour tout le monde</h1>");
        lPrintWriter.println("</body></html>");
    }
    //===============================================
}
//===============================================
