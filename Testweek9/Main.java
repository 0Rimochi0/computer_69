package Testweek9;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 5, 25000.0);

        try {
            laptop.order(3);
        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            laptop.order(4);
        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}