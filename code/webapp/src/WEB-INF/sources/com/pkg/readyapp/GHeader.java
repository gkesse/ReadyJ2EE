//===============================================
package com.pkg.readyapp;
//===============================================
public class GHeader extends GWidget {
    //===============================================
    // constructor
    //===============================================
    public GHeader() {
        
    }
    //===============================================
    // method
    //===============================================
    public void print() {
        GManager.sGApp lApp = GManager.Instance().getData().app;
        lApp.http_response.setContentType("text/html");
        lApp.http_printer.printf("<html>\n");
        lApp.http_printer.printf("<head><title>%s</title></title>\n", lApp.app_name);
        lApp.http_printer.printf("<body style='"+
        "backgound-color: #301010;"+
        "color: #ffffff;"+
        "font-size: 20px;"+
        "'>\n");
    }
    //===============================================
}
//===============================================
