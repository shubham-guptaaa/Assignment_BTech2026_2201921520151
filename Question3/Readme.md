# Question 3

## Description
This question involves creating a class `Employee` with multiple constructors to initialize employee details and a method to display these details.

## Files
- `employee.java`: Contains the implementation of the `Employee` class.

## Implementation
The `Employee` class has multiple constructors to initialize the employee's name, id, and department. It also has a method `displayDetails` to print the employee's details.

## Concept
The concept of `Object-Oriented Programming (OOP)` used to solve this question is `Polymorphism`.

`Polymorphism` is demonstrated by defining multiple constructors in the `Employee` class. These constructors allow the creation of `Employee` objects with different sets of initial data.

### Code
```java
package Question3;

public class Employee {
    private String name;
    private int id;
    private String dept;

    // Constructor to initialize name
    public Employee(String name) {
        this.name = name;
    }

    // Constructor to initialize name and id
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Constructor to initialize name, id, and department
    public Employee(String name, int id, String dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }

    // Method to display the details of the employee
    public void displayDetails() {
        System.out.println("Name: " + name);
        if (id != 0) {
            System.out.println("Id: " + id);
        }
        if (dept != null) {
            System.out.println("Department: " + dept);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Shubham Gupta");
        emp1.displayDetails();

        Employee emp2 = new Employee("Shubham Gupta", 151);
        emp2.displayDetails();

        Employee emp3 = new Employee("Shubham Gupta", 151, "IT");
        emp3.displayDetails();
    }
}

## Output
Name: Shubham Gupta
Name: Shubham Gupta
Id: 151
Name: Shubham Gupta
Id: 151
Department: IT