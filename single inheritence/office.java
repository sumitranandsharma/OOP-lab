// Parent class
class Employee {
    double salary = 40000;

    void showSalary() {
        System.out.println("Employee salary: 100000₹" + salary);
    }
}

// Child class
class Manager extends Employee {
    int bonus = 10000;

    void showTotalPay() {
        System.out.println("Manager total pay: 90000₹" + (salary + bonus));
    }
}

// Main class
public class office {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.showSalary(); // inherited from Employee
        m.showTotalPay(); // defined in Manager
    }
}
