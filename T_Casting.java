/**
Assigning a value of one type to a variable of another type is known as Type Casting.
*/
class A {
   public void print() {
      System.out.println("A");
   }
}
class T_Casting extends A {
   public void print() {
      System.out.println("Hello!!");
   }
   public static void main(String[ ] args) {
    A object = new T_Casting();
    T_Casting b = (T_Casting) object;
    b.print();
   }
}
/**
Java supports automatic type casting of integers to floating points, since there is no loss of precision.
On the other hand, type casting is mandatory when assigning floating point values to integer variables.
*/
/**
Upcasting:
You can cast an instance of a subclass to its superclass.
Consider the following example, assuming that Cat is a subclass of Animal.
Animal a = new Cat();
Java automatically upcasted the Cat type variable to the Animal type.
*/
/**
Casting an object of a superclass to its subclass is called downcasting.
Example:
Animal a = new Cat();
((Cat)a).makeSound();
This will try to cast the variable a to the Cat type and call its makeSound() method.
*/
/**
Why is upcasting automatic, downcasting manual? Well, upcasting can never fail. But if 
you have a group of different Animals and want to downcast them all to a Cat, then 
there's a chance that some of these Animals are actually Dogs, so the process fails.
*/