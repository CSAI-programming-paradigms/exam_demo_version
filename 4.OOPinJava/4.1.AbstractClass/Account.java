// Task 1:
// Define an abstract class `Account` with fields accountNumber and balance,
// plus an abstract method computeInterest().
// Implement concrete subclasses `SavingsAccount` (4% interest) and `CheckingAccount` (1% interest).

abstract class Account {
    // TODO: add fields and constructor

    public abstract double computeInterest();

    public void printDetails() {
        System.out.printf("Account: %s, Balance: %.2f, Interest: %.2f%n",
                          accountNumber, balance, computeInterest());
    }
}

class SavingsAccount extends Account {
    // TODO: implement constructor and computeInterest()
}

class CheckingAccount extends Account {
    // TODO: implement constructor and computeInterest()
}

public class Main {
    public static void main(String[] args) {
        Account sa = new SavingsAccount("SA123", 1000.0);
        Account ca = new CheckingAccount("CA456", 2000.0);

        sa.printDetails();  // Expected: Account: SA123, Balance: 1000.00, Interest: 40.00
        ca.printDetails();  // Expected: Account: CA456, Balance: 2000.00, Interest: 20.00
    }
}
