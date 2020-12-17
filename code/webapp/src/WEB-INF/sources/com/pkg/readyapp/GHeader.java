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
        lApp.http_printer.printf("<head>\n", lApp.app_name);
        lApp.http_printer.printf("<title>%s</title>\n", lApp.app_name);
        lApp.http_printer.printf("<link rel='stylesheet' type='text/css' href='%s'>\n", lApp.style_path);
        lApp.http_printer.printf("<link rel='stylesheet' type='text/css' href='%s'>\n", lApp.icon_path);
        lApp.http_printer.printf("<link rel='stylesheet' type='text/css' href='%s'>\n", lApp.font_allan);
        lApp.http_printer.printf("<body>\n");
    }
    //===============================================
}
//===============================================
