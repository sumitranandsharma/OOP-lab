// Parent class
class Person {
    String name = "Unknown";

    void displayInfo() {
        System.out.println("Name: " + name);
    }
}

// Child class
class Student extends Person {
    int rollNumber = 101;

    // Overriding method
    @Override
    void displayInfo() {
        name = "Sumit";
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Main class
public class Name {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayInfo();  // Calls overridden method
    }
}
