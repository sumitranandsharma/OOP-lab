// Grandparent class
class Person {
    String name = "Sumit";

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

// Parent class
class Employee extends Person {
    int empId = 1001;

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
    }
}

// Child class
class Manager extends Employee {
    String dept = "IT";

    void displayManager() {
        System.out.println("Department: " + dept);
    }
}

// Main class
public class Managers {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.displayPerson();     // from Person
        m.displayEmployee();   // from Employee
        m.displayManager();    // from Manager
    }
}
