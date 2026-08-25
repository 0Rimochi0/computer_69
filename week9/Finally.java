package week9;

public class Finally {


    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = a/b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally {
            System.out.println("This block is executed regardless of whether an exception occurred or not.");
        }
    }
}
