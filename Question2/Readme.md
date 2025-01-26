# Question 2

## Description
Create a class Calculator with the following methods:
- calculateSum(int number1, int number2) to calculate the sum of two numbers.
- calculateDifference(int number1, int number2) to calculate the difference between two numbers.

## Files
- `Calculator.java`: Contains the implementation of the `Calculator` class.

## Implementation
The `Calculator` class has two methods:
- `sum(int number1, int number2)`: Calculates the sum of two numbers.
- `difference(int number1, int number2)`: Calculates the difference between two numbers.

## Concept
The concept of `Object-Oriented Programming (OOP)` used to solve this question is `Encapsulation`.

`Encapsulation` is demonstrated by defining a class `Calculator` that contains methods `sum` and `difference`. These methods encapsulate the behavior of performing arithmetic operations, and the class provides a way to interact with this behavior through its public methods.

### Code
```java
package Question2;

public class Calculator {
    // Method to calculate the sum of two numbers
    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    // Method to calculate the difference of two numbers
    public int difference(int number1, int number2) {
        return number1 - number2;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int add = obj.sum(3, 4);
        System.out.println(add);
        int sub = obj.difference(5, 2);
        System.out.println(sub);
    }
}

### Output
7
3