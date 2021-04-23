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
        response.setContentType("text/html");
        PrintWriter lPrintWriter = response.getWriter();
        lPrintWriter.println("<html>");
        lPrintWriter.println("<head>");
        lPrintWriter.println("<title>ReadyApp</title>");
        lPrintWriter.println("</head>");
        lPrintWriter.println("<body>");
        lPrintWriter.println("<h1>[Servlet] Bonjour tout le monde</h1>");
        lPrintWriter.println("</body>");
        lPrintWriter.println("</html>");
    }
    //===============================================
}
//===============================================
