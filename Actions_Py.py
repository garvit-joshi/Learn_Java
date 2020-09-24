import glob
import os
ifile=open("Input.txt","w")
for file in glob.glob("*.java"):
    command="javac \""+file+"\""
    os.system(command)
    ifile.write(command)
    ifile.write("\n")