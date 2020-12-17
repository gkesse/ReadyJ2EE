//===============================================
package com.pkg.readyapp;
//===============================================
public class GHeader extends GWidget {
    //===============================================
    public GHeader() {
        
    }
    //===============================================
    public void print() {
        GManager.sGApp lApp = GManager.Instance().getData().app;
        lApp.http_response.setContentType("text/html");
        lApp.http_printer.printf("<html>\n");
        lApp.http_printer.printf("<head><title>%s</title></title>\n", lApp.app_name);
        lApp.http_printer.printf("<body>\n");
    }
    //===============================================
}
//===============================================
