//===============================================
package com.pkg.readyapp;
//===============================================
public class GHome extends GWidget {
    //===============================================
    // constructor
    //===============================================
    public GHome() {
        
    }
    //===============================================
    // method
    //===============================================
    public void print() {
        GWidget.Create("header").print();

        GWidget lListBox = GWidget.Create("listbox");
        lListBox.addItem("SQLite");
        lListBox.addItem("SQLite");
        lListBox.addItem("SQLite");
        lListBox.addItem("SQLite");
        
        GWidget.Create("footer").print();
    }
    //===============================================
}
//===============================================
