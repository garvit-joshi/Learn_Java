/**
Exception handling is a powerful mechanism that handles runtime errors to maintain normal 
application flow.
*/
/**
An exception can occur for many different reasons. Some examples:
- A user has entered invalid data.
- A file that needs to be opened cannot be found.
- A network connection has been lost in the middle of communications.
- Insufficient memory and other issues related to physical resources.
*/
public class Y_Exception 
{
	/*static int div(int a, int b) throws ArithmeticException 
	{
        if(b == 0) 
		{
            throw new ArithmeticException("Division by Zero");
        } 
		else 
		{
            return a / b;
        }
    }*/
    public static void main(String[ ] args) 
	{
        try 
		{
            int a[ ] = new int[2];
            System.out.println(a[5]);
        } catch (Exception e) {                      
            System.out.println("An error occurred");
        }
		/**
		(Exception e) statement in the catch block - it is used to catch all possible 
		Exceptions.
		System.out.println(div(42, 0));
		*/
    }
}