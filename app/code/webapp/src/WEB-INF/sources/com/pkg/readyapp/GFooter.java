//===============================================
package com.pkg.readyapp;
//===============================================
public class GFooter extends GWidget {
    //===============================================
    // constructor
    //===============================================
    public GFooter() {
        
    }
    //===============================================
    // method
    //===============================================
    public void print() {
        GManager.sGApp lApp = GManager.Instance().getData().app;
        lApp.http_printer.printf("</body>\n");
        lApp.http_printer.printf("</html>\n");
    }
    //===============================================
}
//===============================================
