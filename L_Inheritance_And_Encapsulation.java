/**
Encapsulation:
The idea behind encapsulation is to ensure that implementation details are 
not visible to users. The variables of one class will be hidden from the 
other classes, accessible only through the methods of the current class. 
This is called data hiding.
To achieve encapsulation in Java, declare the class' variables as private 
and provide public setter and getter methods to modify and view the variables' 
values.
In summary, encapsulation provides the following benefits:
- Control of the way data is accessed or modified
- More flexible and easily changed code
- Ability to change one part of the code without affecting other parts
*/
/**
 * Inheritance: Inheritance is the process that enables one class to acquire the
 * properties (methods and variables) of another. With inheritance, the
 * information is placed in a more manageable, hierarchical order. The class
 * inheriting the properties of another is the subclass (also called derived
 * class, or child class); the class whose properties are inherited is the
 * superclass (base class, or parent class).
 */
class Animal {
    protected int legs;

    /**
     * protected access modifier, makes the members visible only to the subclasses.
     */
    public void eat() {
        System.out.println("Animal eats, Legs:" + legs);
    }
}

class Dog extends Animal {
    /**
     * When one class is inherited from another class, it inherits all of the
     * superclass' non-private variables and methods.
     */
    Dog() {
        legs = 4;
    }
}

class L_Inheritance_And_Encapsulation {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}