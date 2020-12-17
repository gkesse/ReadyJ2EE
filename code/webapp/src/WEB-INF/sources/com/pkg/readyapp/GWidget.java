//===============================================
package com.pkg.readyapp;
//===============================================
import java.io.*;
//===============================================
public class GWidget {
    //===============================================
    public GWidget() {
        
    }
    //===============================================
    public static GWidget Create(String key) {
        if(key == "widget") return new GWidget();
        if(key == "header") return new GHeader();
        if(key == "footer") return new GFooter();
        if(key == "home") return new GHome();
        return new GWidget();
    }
    //===============================================
    public void print() {
        GManager.sGApp lApp = GManager.Instance().getData().app;
        lApp.http_printer.printf("<h1>Bonjour tout (Ok) le monde</h1>\n");
    }
    //===============================================
}
//===============================================
