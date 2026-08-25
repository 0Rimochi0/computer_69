package week9;

public class Throw {
    public static void main(String[] args) {
        
        if(amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
            
        }
    }
}

    public static void main(String[] args) {
        Throw th = new Throw();
        th.validateAmount(0);
    }