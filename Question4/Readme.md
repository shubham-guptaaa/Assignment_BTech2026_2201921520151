# Question 4

##
Codechef

## Description
Create Student Class
You are given a class Student having attributes as name and age and a display method to print name and age of Student. Create a object of student class with given name and age. Use display method to print information of the Student.

## Input Format
The first line of input will contain a string and integer representing name and age respectively.

## Output Format
Use display method to print the name and age of Student.

## Sample 1:
# Input
Alice 45
# Output
Alice 45

## Files
- `Student.java`: Contains the implementation of the `Student` and `Codechef` classes.

## Implementation
The `Student` class has two attributes:
- `name`: A `String` representing the student's name.
- `age`: An `int` representing the student's age.

The class also has a method `display` to print the student's details.

The `Codechef` class contains the `main` method which creates an instance of `Student`, takes input from the user, and displays the student's details.

## Concept
The concept of `Object-Oriented Programming (OOP)` used to solve this question is `Encapsulation`.

`Encapsulation` is demonstrated by defining a class `Student` that contains attributes `name` and `age`, and a method `display` to encapsulate the behavior of displaying the student's details.

### Code
```java
import java.util.Scanner;

class Student {
    public String name;
    public int age;

    public void display() {
        System.out.println(name + " " + age);
    }
}

class Codechef {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner scanner = new Scanner(System.in);

        s.name = scanner.next();
        s.age = scanner.nextInt();

        s.display();

        scanner.close();
    }
}