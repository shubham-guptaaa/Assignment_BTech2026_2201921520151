# Question 1

## Description
This question involves creating a class `MessagePrinter` with a method `printMessage(String msg)` which prints the message "hello <msg>".

## Files
- `MessagePrinter.java`: Contains the implementation of the `MessagePrinter` class.

## Implementation
The `MessagePrinter` class has a method `printMessage` that takes a `String` parameter `msg` and prints "Hello + msg".

## Concept
The concept of `Object-Oriented Programming (OOP)` used to solve this question is `Encapsulation`.

`Encapsulation` is demonstrated by defining a class `MessagePrinter` that contains a method `printMessage`. The method `encapsulates` the behavior of `printing a message`, and the class provides a way to interact with this behavior through its public method.

### Code
```java
package Question1;

public class MessagePrinter {
    public void printMessage(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        MessagePrinter obj = new MessagePrinter();
        obj.printMessage("Shubham");
    }
}

### Output
Hello Shubham