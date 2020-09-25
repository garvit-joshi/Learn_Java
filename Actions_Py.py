#This File is Used by GitHub Actions to check if Uploded Java Code has no Error
import glob
import os
ifile=open("Input.txt","w")
for file in glob.glob("*.java"):
    command="javac \""+file+"\""
    os.system(command)
    ifile.write(command)
    ifile.write("\n")
