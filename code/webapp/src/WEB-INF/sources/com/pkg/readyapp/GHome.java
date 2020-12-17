//===============================================
package com.pkg.readyapp;
//===============================================
public class GHome extends GWidget {
    //===============================================
    public GHome() {
        
    }
    //===============================================
    public void print() {
        GWidget.Create("header").print();
        GWidget.Create("body").print();
        GWidget.Create("footer").print();
    }
    //===============================================
}
//===============================================
