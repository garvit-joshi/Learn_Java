class Counter {
	public static int COUNT = 0;

	/**
	 * When you declare a variable or a method as static, it belongs to the class,
	 * rather than to a specific instance. This means that only one instance of a
	 * static member exists, even if you create multiple objects of the class, or if
	 * you don't create any. It will be shared by all objects.
	 */
	Counter() {
		COUNT++;
		/**
		 * The COUNT variable will be shared by all objects of that class.
		 */
	}
}

class Vehicle {
	public static void horn() {
		System.out.println("Beep");
	}
}

public class J_Static {
	public static int pCount;

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		System.out.println(Counter.COUNT);
		Vehicle.horn();
		/**
		 * the horn method can be called without creating an object: because it is a
		 * static method.
		 */
		J_Static.pCount = 1;
		J_Static.pCount++;
		System.out.println(J_Static.pCount);
	}
}
/**
 * Another example of static methods are those of the Math class, which is why
 * you can call them without creating a Math object.
 */