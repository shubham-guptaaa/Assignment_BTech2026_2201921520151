//1. Create a class MessagePrinter with a method printMessage(String name) which prints the message "hello <name>".

package Question1;
public class MessagePrinter{
    public void printmessage(String msg){
        System.out.println("Hello "+msg);
    }
    public static void main(String[] args){
        MessagePrinter obj = new MessagePrinter();
        obj.printmessage("Shubham");
    }
}