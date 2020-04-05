class Animal
{
    void bark()
	{
        System.out.println("Woof-Woof");
    }
}
class Vehicle
{
    private String color;
	
	/**
	Constructor
	A constructor can be used to provide initial values for object attributes.
		- A constructor name must be same as its class name.
		- A constructor must have no explicit return type.
	*/
	Vehicle()
	{
		color = "Red";
	}
	Vehicle(String c)
	{
		this.setColor(c);
	}
	/**
	Java automatically provides a default constructor, so all classes have a constructor, 
	whether one is specifically defined or not.
	*/
	
    // Getter
    public String getColor()
	{
        return color;
    }
	
    // Setter
    public void setColor(String c)
	{
        this.color = c;
    }
	/**
	Getters and setters are fundamental building blocks for encapsulation,
	*/
}
class H_Objects 
{
    public static void main(String[ ] args)
	{
        Animal dog = new Animal();
        dog.bark();
		/**
		Now, dog is an object of type Animal. Thus we can call its bark() method, 
		using the name of the object and a dot. The dot notation is used to access 
		the object's attributes and methods.
		*/
		Vehicle v1 = new Vehicle();
        v1.setColor("Green");
        System.out.println(v1.getColor());
		Vehicle v2 = new Vehicle("Blue");
		System.out.println(v2.getColor());
    }
}
/**
default: A variable or method declared with no access control modifier is available 
	to any other class in the same package.
public: Accessible from any other class.
protected: Provides the same access as the default access modifier, with the addition 
	that subclasses can access protected methods and variables of the superclass 
private: Accessible only within the declared class itself.
*/