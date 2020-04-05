class K_Final
{
    public static final double PI = 3.14; 
	/**
	final keyword to mark a variable constant, so that it can be
	assigned only once.
	*/
    public static void main(String[ ] args)
	{
        System.out.println(PI);
    }
}
/**
Methods and classes can also be marked final. This serves to restrict 
methods so that they can't be overridden and classes so that they can't 
be subclassed.
*/