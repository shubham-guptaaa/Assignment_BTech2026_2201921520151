package Question2;

public class Calculator {
    //Method to calculate the sum of two number
    public int sum(int number1, int number2){
        return number1+number2;
    }

    //Method to calculate the difference of two number
    public int difference(int number1, int number2){
        return number1-number2;
    }
    public static void main(String[] args){
        Calculator obj = new Calculator();
        int add = obj.sum(3, 4);
        System.out.println(add);
        int sub = obj.difference(5, 2);
        System.out.println(sub);
    }
}
