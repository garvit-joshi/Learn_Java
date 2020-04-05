class B_Variables
{
	public static void main(String[ ] args)
	{
		String name ="David";        //You are allowed to define an empty string. For example, String str = "";
		int age = 42;
		int x=++age;                 //Prefix: Increments the variable's value and uses the new value in the expression.
		int y=age++;                 //Postfix: The variable's value is first used in the expression and is then increased.
		double score =15.9;
		++score; 
		char group = 'Z';            //The char data type represents a single character.
		boolean online = true;
		String firstName, lastName;
		firstName = "David";       
		lastName = "Williams"; 
		System.out.println("My name is " + firstName +" "+lastName);     //The + (plus) operator between strings adds them together to make a new string. This process is called concatenation.
	}
}