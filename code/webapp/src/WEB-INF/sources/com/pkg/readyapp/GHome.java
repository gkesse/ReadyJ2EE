//===============================================
package com.pkg.readyapp;
//===============================================
public class GHome extends GWidget {
    //===============================================
    public GHome() {
        
    }
    //===============================================
    public void print() {
        GWidget lListBox = GWidget.Create("listbox");

        GWidget.Create("header").print();
        lListBox.print();
        GWidget.Create("footer").print();
    }
    //===============================================
}
//===============================================
