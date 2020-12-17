//===============================================
package com.pkg.readyapp;
//===============================================
import java.io.*;
//===============================================
public class GWidget {
    //===============================================
    // constructor
    //===============================================
    public GWidget() {
        
    }
    //===============================================
    public static GWidget Create(String key) {
        // widget
        if(key == "widget") return new GWidget();
        if(key == "header") return new GHeader();
        if(key == "footer") return new GFooter();
        if(key == "listbox") return new GListBox();
        // page
        if(key == "home") return new GHome();
        return new GWidget();
    }
    //===============================================
    // method
    //===============================================
    public void print() {}
    public void addItem(String text) {}
    //===============================================
}
//===============================================
