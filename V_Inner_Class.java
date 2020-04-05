/**
Java supports nesting classes; a class can be a member of another class.
Just write a class within a class. Unlike a class, an inner class can be 
private. Once you declare an inner class private, it cannot be accessed 
from an object outside the class.
*/
class Robot {
    int id;
    Robot(int i) {
        id = i;
        Brain b = new Brain();
        b.think();
    }

    private class Brain {
        public void think() {
            System.out.println(id + " is thinking");
        }
    }
}
/**
The class Robot has an inner class Brain. The inner class can access all of 
the member variables and methods of its outer class, but it cannot be accessed 
from any outside class.
*/
public class V_Inner_Class {
    public static void main(String[] args) {
        Robot r = new Robot(1);
    }
}