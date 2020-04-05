class A {
    public A() {
        System.out.println("New A");
    }
}
class B extends A {
    public B() {
        System.out.println("New B");
    }
}

class M_Inheritance_And_Encapsulation {
    public static void main(String[ ] args) {
		/**
		Constructors are not member methods, and so are not inherited by subclasses.
		However, the constructor of the superclass is called when the subclass is instantiated.
		*/
        B obj = new B();
    }
}
/**
Output:
"New A"
"New B"
*/
/**
You can access the superclass from the subclass using the super keyword.
For example, super.var accesses the var member of the superclass.
*/