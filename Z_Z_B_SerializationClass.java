import java.io.*; //Contains Serializable Interface
import java.util.*; //Conatins Scanner

class Emp implements Serializable {
	/********************************************************
	 * We Are Implementing Serializable Interface with Emp Class Because We want to
	 * make this class objects into stream of Bytes
	 **********************************************************/
	public String name;
	public String address;
}

public class Z_Z_B_SerializationClass {
	public static void main(String[] args) {
		String file_name;
		Scanner cin = new Scanner(System.in); // For takin user input
		Emp e = new Emp(); // Making An Object of Emp
		System.out.print("Enter Name:");
		e.name = cin.nextLine();
		System.out.print("Enter Address:");
		e.address = cin.nextLine();
		try {
			System.out.print("Enter The File Name Where You want to store the Data(Add .txt):");
			file_name = cin.nextLine();
			FileOutputStream file1 = new FileOutputStream(file_name);
			/*****************************************************
			 * The Above Line Shows That The ByteStream of Emp's Object Will be stored in a
			 * perticular file given in parentheseis.
			 *****************************************************/
			ObjectOutputStream out = new ObjectOutputStream(file1);
			/*****************************************************
			 * We create an object of ObjectOutputStream with the constructor with a
			 * parameter of Object of FileOutputStream
			 ******************************************************/
			out.writeObject(e);
			/*****************************************************
			 * The Above Function is Present In ObjectOutputStream writeObject will take a
			 * parameter of object that we want to write in a file.
			 *****************************************************/
			out.close();
			file1.close();
			/*****************************************************
			 * We will close both the objects
			 *****************************************************/
			System.out.println("Data Has Been Stored in " + file_name);
		} catch (IOException l) {
			/****************************************************
			 * If An Exception Is Caught, this catch part will run
			 ****************************************************/
			l.printStackTrace();
		}
	}
}