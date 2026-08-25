package week9;

public class Alimetic {
    

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = a/b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        
        System.out.println("Program continues after handling the exception.");
    }
}
