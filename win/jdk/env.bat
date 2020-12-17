@echo off
::===============================================
set "PATH=C:\MinGW\bin;%PATH%"
set "PATH=C:\Program Files\Java\jdk-11.0.1\bin;%PATH%"
::===============================================
set "GPROJECT_ROOT=C:\Users\Admin\Downloads\Programs"
set "GPROJECT_PATH=%GPROJECT_ROOT%\ReadyJ2EE"
set "GPROJECT_SRC=%GPROJECT_PATH%\code\webapp\src\WEB-INF\sources"
set "GPROJECT_CLASS=%GPROJECT_PATH%\code\webapp\src\WEB-INF\classes"
set "GMAIN_JAVA=%GPROJECT_SRC%\com\pkg\readyapp\GMain.java"
set "GWEB_ROOT=%GPROJECT_PATH%\code\webapp\src"
::===============================================
set "CLASSPATH="
set "CLASSPATH=C:\Users\Admin\Downloads\Compressed\apache-tomcat-7.0.107-windows-x64\apache-tomcat-7.0.107\lib\servlet-api.jar;%CLASSPATH%"
::===============================================
set "GGIT_URL=https://github.com/gkesse/ReadyJ2EE.git"
set "GGIT_NAME=ReadyJ2EE"
::===============================================
