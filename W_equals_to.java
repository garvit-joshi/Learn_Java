class Animal
{
    String name;
    Animal(String n)
	{
        name = n;
    }
}
/**
(==)compares the references and not the object values.
*/
class W_equals_to {
    public static void main(String[ ] args) {
        Animal a1 = new Animal("Robby");
        Animal a2 = new Animal("Robby");
        System.out.println(a1 == a2);           //Output:False 
		/**
		Despite having two objects with the same name, the equality 
		testing returns false, because we have two different objects 
		(two different references or memory locations).
		*/
    }
}