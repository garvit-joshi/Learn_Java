import java.io.*; //Contains Serializable Interface
import java.util.*; //Conatins Scanner

class Emp implements Serializable {
	public String name;
	public String address;
}

public class Z_Z_C_DeserializationClass {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Emp e = null;
		/*************************************************************************
		 * We Will Create an object that is null as we will store data from file into
		 * the object in try block
		 *************************************************************************/
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter The File Form Where You Want To Retrieve The data:");
		String file_name = cin.nextLine();
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(file_name);
			ObjectInputStream in = new ObjectInputStream(file);
			/*********************************************************************
			 * As The file will have data of object, we will createte an object of
			 * ObjectInputStream to read the data from the file and store it in an object
			 * using readObject method
			 *********************************************************************/
			e = (Emp) in.readObject();
			/********************************************************************
			 * We Will Be Read data with readObject() method and will store it in e object
			 * of Emp class
			 ********************************************************************/
			in.close();
			file.close();
			/*******************************************************************
			 * Close Both Input Stream
			 *******************************************************************/
			System.out.println("Name:" + e.name);
			System.out.println("Address:" + e.address);
			/******************************************************************
			 * We Will Show all the data That has been retrived from the file
			 *******************************************************************/
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		}
		cin.close();
	}
}