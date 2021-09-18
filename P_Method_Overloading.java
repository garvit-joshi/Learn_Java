/**
 * When methods have the same name, but different parameters, it is known as
 * method overloading. This can be very useful when you need the same method
 * functionality for different types of parameters.
 */
class P_Method_Overloading {
    static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(8, 17)); // Calls:static int max(int a, int b) {
        System.out.println(max(3.14, 7.68)); // Calls:static double max(double a, double b) {
    }
}
/**
 * Another name for method overloading is compile-time polymorphism.
 */
/**
 * An overloaded method must have a different argument list; the parameters
 * should differ in their type, number, or both.
 */
