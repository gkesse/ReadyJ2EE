//===============================================
package com.pkg.readyapp;
//===============================================
import java.util.*;
//===============================================
public class GListBox extends GWidget {
    //===============================================
    // property
    //===============================================
    List<String> m_itemMap;
    //===============================================
    // constructor
    //===============================================
    public GListBox() {
        m_itemMap = new ArrayList<String>();
    }
    //===============================================
    // method
    //===============================================
    public void start() {
        GManager.sGApp lApp = GManager.Instance().getData().app;
        lApp.http_printer.printf("<div class='listbox'>\n");
    }
    //===============================================
    public void end() {
        GManager.sGApp lApp = GManager.Instance().getData().app;
        lApp.http_printer.printf("</div>\n");
    }
    //===============================================
    public void addItem(String text) {
        GManager.sGApp lApp = GManager.Instance().getData().app;
        lApp.http_printer.printf("<div class='item'>%s</div>\n", text);
    }
    //===============================================
    public void addItem(String text, String icon) {
        GManager.sGApp lApp = GManager.Instance().getData().app;
        lApp.http_printer.printf("<div class='item'><i class='fa fa-%s' ></i> %s</div>\n", icon, text);
    }
    //===============================================
}
//===============================================
