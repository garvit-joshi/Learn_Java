/**
An interface is a completely abstract class that contains only abstract methods.
Some specifications for interfaces:
- Defined using the interface keyword.
- May contain only static final variables.
- Cannot contain a constructor because interfaces cannot be instantiated.
- Interfaces can extend other interfaces.
- A class can implement any number of interfaces.
*/
/*
Interfaces have the following properties:
- An interface is implicitly abstract. You do not need to use the abstract keyword 
	while declaring an interface.
- Each method in an interface is also implicitly abstract, so the abstract keyword is
	not needed.
- Methods in an interface are implicitly public.
*/
/**
 * A class can inherit from just one superclass, but can implement multiple
 * interfaces!
 */
interface Animal {
    public void eat();

    public void makeSound();
}

/**
 * When you implement an interface, you need to override all of its methods.
 */
class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow");
    }

    public void eat() {
        System.out.println("omnomnom");
    }
}

class S_Interfaces {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
    }
}