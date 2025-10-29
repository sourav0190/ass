// pg6.java
class Student {
    String name;
    int age;

    Student(String name, int age) {
        // "this" is used to refer to current object
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class pg6 {
    public static void main(String[] args) {
        Student s1 = new Student("Aman", 20);
        s1.display();
    }
}
