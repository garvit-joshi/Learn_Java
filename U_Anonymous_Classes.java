/**
Anonymous classes are a way to extend the existing classes on the fly.
*/
class Machine {
    public void start() {
        System.out.println("Starting...");
    }
}

class U_Anonymous_Classes {
    public static void main(String[ ] args) {
        Machine m = new Machine()
		{
            @Override public void start()
			{
				/**
				The @Override annotation is used to make your code easier to understand, 
				because it makes it more obvious when methods are overridden.
				*/
                System.out.println("Wooooo");
            }
        };
		/**
		After the constructor call, we have opened the curly braces and have overridden 
		the start method's implementation on the fly.
		*/
        m.start();                                      //Output:Wooooo
		Machine c = new Machine();
		c.start();                                     //Output:Starting...
    } 
}