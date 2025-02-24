package Task6;

class Account {
   public int accountNumber;
    public double balance;

   
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
    	System.out.println("Deposit amount:"+ amount);
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
    	System.out.println("withdrawal amount:"+ amount);
        if (amount > 0 && balance >= amount) {
            balance -= amount;
          
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}

public class AccountDetails {
    public static void main(String[] args) {
        // Creating an account with an initial balance
        Account acc1 = new Account(101, 500.0);

System.out.println("Initial Balance"+ acc1.balance);
        // Depositing money
        acc1.deposit(200.0);
       
        System.out.println("Balance after deposit: " + acc1.getBalance());

        // Withdrawing money
        boolean success = acc1.withdraw(100.0);
        System.out.println("Withdrawal successful: " + success);
        System.out.println("Balance after withdrawal: " + acc1.getBalance());

        // Attempting to withdraw more than balance
        success = acc1.withdraw(700.0);
        System.out.println("Withdrawal successful: " + success);
        System.out.println("Final balance: " + acc1.getBalance());
    }
}
