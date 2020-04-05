import glob, os
import sys
a=sys.path
count=0
l=0
os.chdir(a[0])
file1=open("List.txt","a")
file2=open("Input.txt","w")
i=1
for file in glob.glob("*.class"):
	file1.write(file)
	file1.write("\n")
	if(count%2==0):
		print(i,".",file,end="")
		g=str(i)
		l=len(file)+len(g)
	else:
		print("".rjust(40-l,' '),i,".",file)
	i=i+1
	count=count+1
file1.write("==============================\n")
file1.write("******************************")
print("")
flag=1
while flag==1:
	f=int(input("Enter The File No. You Want To Execute:"))
	i=1
	for file in glob.glob("*.class"):
		if(i==f):
			flag=0
			x=file
			break
		i=i+1
	if flag==1:
		print("File Not Found!!\nPlease Enter Again:")
x= x[:-6]
file2.write(x)
file1.close()
file2.close()