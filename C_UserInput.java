import java.util.Scanner;
class C_UserInput
{
	public static void main(String[ ] args)
	{
		Scanner cin = new Scanner(System.in);    //In order to use the Scanner class, create an instance of the class by using the following syntax
		System.out.println(cin.nextLine());
		cin.close();
		/*
		cin.close():If you do not close the scanner class it will generate warnings like Resource leak.
		Resource leak is generally an erroneous pattern of resource consumption where a program does not release the resource it has acquired.
		This can lead to poor services. 
		*/
	}
}
/**
Read a byte - nextByte()
Read a short - nextShort()
Read an int - nextInt()
Read a long - nextLong()
Read a float - nextFloat()
Read a double - nextDouble()
Read a boolean - nextBoolean()
Read a complete line - nextLine()
Read a word - next().charAt(0);
*/