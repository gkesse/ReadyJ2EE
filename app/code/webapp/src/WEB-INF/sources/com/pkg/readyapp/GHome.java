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
        lListBox.start();
        lListBox.addItem("SQLite", "book");
        lListBox.addItem("SQLite", "book");
        lListBox.addItem("SQLite", "book");
        lListBox.addItem("SQLite", "book");
        lListBox.end();
        
        GWidget.Create("footer").print();
    }
    //===============================================
}
//===============================================
