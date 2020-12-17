//===============================================
package com.pkg.readyapp;
//===============================================
public class GListBox extends GWidget {
    //===============================================
    // constructor
    //===============================================
    public GListBox() {
        
    }
    //===============================================
    // method
    //===============================================
    public void addItem(String text) {
        GManager.sGApp lApp = GManager.Instance().getData().app;
        lApp.http_printer.printf("<div style='"+
        "background-color: #503030;"+
        "'>%s</div>\n", text);
    }
}
//===============================================
