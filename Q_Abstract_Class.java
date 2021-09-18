/**
Data abstraction provides the outside world with only essential information, 
in a process of representing essential features without including implementation 
details.
*/
/**
An abstract class is defined using the abstract keyword.
- If a class is declared abstract it cannot be instantiated (you cannot create objects of 
	that type).
- To use an abstract class, you have to inherit it from another class.
- Any class that contains an abstract method should be defined as abstract.
*/
/**
 * An abstract method is a method that is declared without an implementation
 * (without braces, and followed by a semicolon): abstract void walk();
 */
abstract class Animal {
    /**
     * A class containing an abstract method is an abstract class.
     */
    int legs = 0;

    abstract void makeSound();
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Q_Abstract_Class {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeSound();
    }
}