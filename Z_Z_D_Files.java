import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

class Z_Z_D_Files {
    static void Create_A_File() {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the File you want to create(With Extention):");
        String file_name = cin.nextLine();
        try {
            File myObj = new File(file_name);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static void Read_File() {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter The File You want to Read:(With Extention)");
        String file_name = cin.nextLine();
        try {
            File file1 = new File(file_name);
            Scanner fin = new Scanner(file1);
            while (fin.hasNextLine()) {
                String lines = fin.nextLine();
                System.out.println(lines);
            }
            fin.close();
        } catch (FileNotFoundException e) {
            System.out.println("An Error Occurred.");
            e.printStackTrace();
        }
    }

    static void Write_A_File() {
        String choice;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter The File You want to Write:(With Extention)");
        String file_name = cin.nextLine();
        try {
            System.out.println("Do you want to Append in the File(y/n):");
            choice = cin.nextLine();
            if (choice.equals("Yes") || choice.equals("yes") || choice.equals("y") || choice.equals("Y")) {
                FileWriter file1 = new FileWriter(file_name, true);
                System.out.println("Enter the text you want to write in the file.");
                String Text_In_File = cin.nextLine();
                file1.write(Text_In_File);
                file1.close();
            } else {
                FileWriter file1 = new FileWriter(file_name);
                System.out.println("Enter the text you want to write in the file.");
                String Text_In_File = cin.nextLine();
                file1.write(Text_In_File);
                file1.close();
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static void Delete_A_File() {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter The File You want to Delete:(With Extention)");
        String file_name = cin.nextLine();
        File file1 = new File(file_name);
        if (file1.delete()) {
            System.out.println("Deleted the file: " + file1.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    static void Delete_A_Folder() {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter The Folder You want to Delete:");
        String folder = cin.nextLine();
        File myObj = new File(folder);
        if (myObj.delete()) {
            System.out.println("Deleted the folder:" + myObj.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
    }

    static void Know_A_File() {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter The File You want to Know About:(With Extention)");
        String file_name = cin.nextLine();
        File file1 = new File(file_name);
        if (file1.exists()) {
            System.out.println("File name: " + file1.getName());
            System.out.println("File size in bytes " + file1.length());
            System.out.println("Absolute path: " + file1.getAbsolutePath());
            System.out.println("Readable " + file1.canRead());
            System.out.println("Writeable: " + file1.canWrite());
        } else {
            System.out.println("Error:The file does not exist.");
        }
    }

    public static void main(String[] args) {
        int ch;
        String choice;
        boolean looper = true;
        Scanner cin = new Scanner(System.in);
        while (looper == true) {
            System.out.println("1.Create A File");
            System.out.println("2.Read A File");
            System.out.println("3.Write A File");
            System.out.println("4.Delete a file");
            System.out.println("5.Delete a folder(Empty)");
            System.out.println("6.Know A File");
            System.out.print("Enter Your Choice:");
            ch = cin.nextInt();
            switch (ch) {
                case 1:
                    Create_A_File();
                    break;
                case 2:
                    Read_File();
                    break;
                case 3:
                    Write_A_File();
                    break;
                case 4:
                    Delete_A_File();
                    break;
                case 5:
                    Delete_A_Folder();
                    break;
                case 6:
                    Know_A_File();
                    break;
                default:
                    System.out.println("Enter A Valid Choice");
                    break;
            }
            cin.nextLine();
            System.out.println("Do You want To Perform More Operations[Yes/No]");
            choice = cin.nextLine();
            if (choice.equals("Yes") || choice.equals("yes") || choice.equals("y") || choice.equals("Y")) {
                looper = true;
            } else {
                looper = false;
            }
        }
    }
}