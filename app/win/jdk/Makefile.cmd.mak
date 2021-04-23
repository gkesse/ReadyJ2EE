#================================================
GSRC = $(GPROJECT_SRC)
GBUILD = $(GPROJECT_CLASS)

GSRCPATH =\
    $(GSRC) \
#================================================
# jdk
all: compile

compile:
	@if not exist $(GBUILD) ( mkdir $(GBUILD) )
	javac $(GMAIN_JAVA) -d $(GBUILD) -sourcepath $(GSRCPATH)
clean: 
	@if not exist $(GBUILD) ( mkdir $(GBUILD) )
	@del /s /q $(GBUILD)\*.class
#================================================
# apache
apache_start:
	@tomcat7w
#================================================
# cmd
cmd_tree:
	@tree /f $(GWEB_ROOT)
#================================================
# git
git_status:
	@cd $(GPROJECT_PATH) && git status -u
git_push:
	@cd $(GPROJECT_PATH) && git pull && git add --all && git commit -m "Initial Commit" && git push -u origin main
git_clone:
	@cd $(GPROJECT_ROOT) && git clone $(GGIT_URL) $(GGIT_NAME) 
#================================================
