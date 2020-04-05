class Animal {
    public void makeSound() {
        System.out.println("Grr...");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}
class O_Method_Overriding
{
    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeSound();
		/**
		Output:
		Meow
		*/
		Animal a= new Animal();
		a.makeSound();
    }
}
/**
Method overriding is also known as runtime polymorphism.
*/
/**
Rules for Method Overriding:
- Should have the same return type and arguments
- The access level cannot be more restrictive than the overridden method's 
	access level (Example: If the superclass method is declared public, the 
	overriding method in the sub class can be neither private nor protected)
- A method declared final or static cannot be overridden
- If a method cannot be inherited, it cannot be overridden
- Constructors cannot be overridden
*/