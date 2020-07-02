class G_OOP
{
	/****************************************************************************************
	A class describes what the object will be, but is separate from the object itself.
	In other words, classes can be described as blueprints, descriptions, or definitions 
	for an object. You can use the same class as a blueprint for creating multiple objects. 
	The first step is to define the class, which then becomes a blueprint for object creation.
	In other words, an object is an instance of a class.
	******************************************************************************************/
	static void sayHello(String name)
	{
		/**************************************************************************************
		Methods define behavior. A method is a collection of statements that are grouped 
		together to perform an operation. System.out.println() is an example of a method.
		***************************************************************************************/
		System.out.println("Hello !! "+name);
	}
	public static void main(String args[])
	{
		/***********************************************************************************
		public static void main(String args[])
		- This definition indicates that the main method takes an array of Strings as its 
		    parameters, and does not return a value.
		**********************************************************************************/
		sayHello("David");
		/***********************************************************************************
		The advantages of using methods instead of simple statements include the following:
		- code reuse: You can write a method once, and use it multiple times, without having to 
					rewrite the code each time.
		- parameters: Based on the parameters passed in, methods can perform various actions.
		**********************************************************************************/
	}
}
/***********************************************************************************
There are 4 core concepts in OOP: encapsulation, inheritance, polymorphism, and abstraction.
**********************************************************************************/