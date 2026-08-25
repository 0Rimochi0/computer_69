package Testweek9;

public class Product {
    private String name;
    private int stock;
    private double price;

    public Product(String name, int stock, double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public void order(int quantity) throws OutOfStockException {
        if (quantity <= 0) {
            System.out.println("Error: Quantity must be greater than 0.");
            return;
        }
        
        if (quantity > stock) {
            throw new OutOfStockException("There is not enough stock of item '" + name + "' (Remaining: " + stock + " pieces, Needed: " + quantity + " pieces)");
        }
        
        stock -= quantity;
        double totalPrice = quantity * price;
        System.out.println("Order placed for " + name + " successfully. Quantity: " + quantity + " pieces | Total Price: $" + totalPrice + " (Remaining: " + stock + " pieces)");
    }

    public int getStock() {
        return stock;
    }
}