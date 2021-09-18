import java.util.*;

class Student {
    private String Name;
    private int Age;

    Student(String Nam, int A) {
        Name = Nam;
        Age = A;
    }

    public void Display() {
        System.out.println("Name:" + Name);
        System.out.println("Age:" + Age);
    }
}

class Z_Z_E_HashMap {
    public static void main(String args[]) {
        String name, Regno;
        int Age;
        /*
         * Create a HashMap object called Data that will store String keys and
         * Student(Object).
         */
        HashMap<String, Student> Data = new HashMap<String, Student>();
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter Name:");
            name = cin.nextLine();
            System.out.println("Enter Age:");
            Age = cin.nextInt();
            cin.nextLine();
            System.out.println("Enter Registration No.:");
            Regno = cin.nextLine();
            /*
             * To add items to HashMap, use the put() method:
             */
            Data.put(Regno, new Student(name, Age));
        }
        System.out.println("\n\nData Added Now Serching:");
        System.out.println("Enter Registration No You want to search:");
        Regno = cin.nextLine();
        Search(Regno, Data);
    }

    public static void Search(String Regno, HashMap<String, Student> Data) {
        /*
         * To access a value in the HashMap, use the get() method and refer to its key:
         */
        Data.get(Regno).Display();
    }
}