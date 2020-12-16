@echo off
::===============================================
set "PATH=C:\MinGW\bin;%PATH%"
set "PATH=C:\Program Files\Java\jdk-11.0.1\bin;%PATH%"
set "PATH=C:\Program Files\Apache Software Foundation\Tomcat 7.0\bin;%PATH%"
::===============================================
set "GPROJECT_ROOT=C:\Users\Admin\Downloads\Programs"
set "GPROJECT_PATH=%GPROJECT_ROOT%\ReadyJ2EE"
set "GPROJECT_SRC=%GPROJECT_PATH%\code\p01\WEB-INF\sources"
set "GPROJECT_CLASS=%GPROJECT_PATH%\code\p01\WEB-INF\classes"
::===============================================
set "CLASSPATH="
set "CLASSPATH=C:\Users\Admin\Downloads\Compressed\apache-tomcat-7.0.107-windows-x64\apache-tomcat-7.0.107\lib\servlet-api.jar;%CLASSPATH%"
::===============================================
set "GDATA_PATH=%GPROJECT_PATH%\data"
set "GSQLITE_DB_PATH=%GDATA_PATH%\sqlite\config.dat"
set "GSTYLE_PATH=%GDATA_PATH%\css\style.css"
set "GFONT_PATH=%GDATA_PATH%\font"
set "GIMG_PATH=%GDATA_PATH%\img"
set "GPDF_PATH=%GDATA_PATH%\pdf\config.pdf"
set "GCMD_PATH=%GDATA_PATH%\cmd\script.bat"
::===============================================
set "GGIT_URL=https://github.com/gkesse/ReadyJ2EE.git"
set "GGIT_NAME=ReadyJ2EE_2"
::===============================================
