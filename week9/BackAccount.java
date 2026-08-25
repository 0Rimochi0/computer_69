package week9;

public class BackAccount {
    private double balance;

    public BackAccount(double amount) {
        this.balance = amount;
    }

        public void withdraw(double amount) throws InSuff {
            if(amount > balance) {
                throw new InSuff("Insufficient funds for withdrawal.");
            }
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }

