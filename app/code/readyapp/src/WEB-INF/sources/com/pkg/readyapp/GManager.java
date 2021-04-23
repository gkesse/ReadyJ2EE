//===============================================
package com.pkg.readyapp;
//===============================================
import java.io.*;
import javax.servlet.http.*;
//===============================================
// manager
//===============================================
public class GManager {
    //===============================================
    // property
    //===============================================
    private static GManager m_intance = null;
    //===============================================
    private sGManager mgr;
    //===============================================
    // constructor
    //===============================================
    private GManager() {
        // manager
        mgr = new sGManager();
        // app
        mgr.app = new sGApp();
        mgr.app.app_name = "ReadyApp";
        mgr.app.style_path = "data/css/style.css";
        mgr.app.icon_path = "libs/font_awesome/4.7.0/css/font-awesome.min.css";
        mgr.app.font_allan = "libs/google_fonts/1.0.0/Allan/css.css";
        mgr.app.sqlite_db_path = getEnv("GSQLITE_DB_PATH");
    }
    //===============================================
    public static synchronized GManager Instance() {           
        if(m_intance == null) {   
            m_intance = new GManager(); 
        }
        return m_intance;
    }
    //===============================================
    // data
    //===============================================
    public sGManager getData() {
        return mgr;
    }
 //===============================================
    public void showData(String data) {
        System.out.print(String.format("[%s]\n", data));
    }
    //===============================================
    public void showData(String[] data) {
        System.out.print(String.format("["));
        for(int i = 0; i < data.length; i++) {
            if(i != 0) System.out.print(String.format(" ; "));
            String lData = data[i];
            System.out.print(String.format("%s", lData));
        }
        System.out.print(String.format("\n"));
    }
    //===============================================
    // env
    //===============================================
    public String getEnv(String key) {
        return System.getenv(key);
    }
    //===============================================
    // string
    //===============================================
    public int getWidth(String widthMap, int index, int defaultWidth) {
        String[] lWidthMap = widthMap.split(";");
        int lLength = lWidthMap.length;
        if(index >= lLength) return defaultWidth;
        String lWidthId = lWidthMap[index]; int lOut;
        if(!lWidthId.chars().allMatch(Character::isDigit)) return defaultWidth;
        int lWidth = Integer.parseInt(lWidthId);
        return lWidth;
    }    
    //===============================================
    // struct
    //===============================================
    class sGManager {
        public sGApp app;
    }
    //===============================================
    class sGApp {
        // app
        public String app_name;
        // http
        public HttpServletResponse http_response;
        public PrintWriter http_printer;
        // style
        public String style_path;
        // icon
        public String icon_path;
        // font
        public String font_allan;
        // sqlite
        public String sqlite_db_path;
    }
    //===============================================
}
//===============================================