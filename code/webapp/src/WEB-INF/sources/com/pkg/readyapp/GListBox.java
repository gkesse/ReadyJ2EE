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
    public void addItem(String text) {
        m_itemMap.add(text);
    }
    //===============================================
    public void print() {
        GManager.sGApp lApp = GManager.Instance().getData().app;
        lApp.http_printer.printf("<div class='listbox'>\n");
        for(int i = 0; i < m_itemMap.size(); i++) {
            String lItem = m_itemMap.get(i);
            lApp.http_printer.printf("<div class='item'><i class='fa fa-book' ></i> %s</div>\n", lItem);
        }
        lApp.http_printer.printf("</div>\n");
    }
}
//===============================================
