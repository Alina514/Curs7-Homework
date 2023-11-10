package Bank;

import Interface.Bank;

public class BTBank implements Bank {
    public void withdraw(double amount) {
        double balance = 0;

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            System.out.println("Deposit successful. New balance: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}
