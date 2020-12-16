GSRC = $(GPROJECT_SRC)
GBUILD = $(GPROJECT_CLASS)

GSRCPATH =\
    $(GSRC) \

all: compile

compile:
	@if not exist $(GBUILD) @mkdir $(GBUILD)
	@javac $(GMAIN_JAVA) -d $(GBUILD) -sourcepath $(GSRCPATH)
clean: 
	@if not exist $(GBUILD) @mkdir $(GBUILD)
	@del /s /q $(GBUILD)\*.class
