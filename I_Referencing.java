class I_Referencing {
    public static void main(String[] args) {
        Person j;
        j = new Person("John");
        j.setAge(20);
        celebrateBirthday(j);
        System.out.println(j.getAge());
        /**
         * Because j is a reference type, the method affects the object itself, and is
         * able to change the actual value of its attribute.
         */
    }

    static void celebrateBirthday(Person p) {
        p.setAge(p.getAge() + 1);
        /**
         * The method celebrateBirthday takes a Person object as its parameter, and
         * increments its attribute.
         */
    }
}

class Person {
    private String name;
    private int age;

    Person(String n) {
        this.name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        this.age = a;
    }
}