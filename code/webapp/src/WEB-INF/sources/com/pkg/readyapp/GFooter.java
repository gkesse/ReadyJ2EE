//===============================================
package com.pkg.readyapp;
//===============================================
public class GFooter extends GWidget {
    //===============================================
    public GFooter() {
        
    }
    //===============================================
    public void print() {
        GManager.sGApp lApp = GManager.Instance().getData().app;
        lApp.http_printer.printf("</body></html>\n");
    }
    //===============================================
}
//===============================================
