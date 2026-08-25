package week9;

public class Main {
    
    public static void main(String[] args) {
        BackAccount account = new BackAccount(4000);
        
        try {
            account.withdraw(2000);
        } catch (InSuff e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Program continues after handling the exception.");
    }
}
