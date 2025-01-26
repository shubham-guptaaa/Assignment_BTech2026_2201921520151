# Question 1

## Description
This question involves creating a class `MessagePrinter` with a method `printMessage(String msg)` which prints the message "hello <msg>".

## Files
- `MessagePrinter.java`: Contains the implementation of the `MessagePrinter` class.

## Implementation
The `MessagePrinter` class has a method `printMessage` that takes a `String` parameter `msg` and prints "Hello <msg>".

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