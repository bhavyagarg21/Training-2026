import java.util.ArrayList;

interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    abstract double calculateInterest();
    public static void main(String[] args) {

        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SA101", "Alice", 20000));
        accounts.add(new CurrentAccount("CA202", "Bob", 50000));

        for (BankAccount acc : accounts) {
            double interest = acc.calculateInterest();
            System.out.println("Interest: " + interest);

            Loanable loanAcc = (Loanable) acc;
            loanAcc.applyForLoan();
            System.out.println("Loan Eligibility: " + loanAcc.calculateLoanEligibility());
        }
    }
}

class SavingsAccount extends BankAccount implements Loanable {

    SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    double calculateInterest() {
        return getBalance() * 0.04;  
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan applied for Savings Account");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5;
    }
}

class CurrentAccount extends BankAccount implements Loanable {

    CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    double calculateInterest() {
        return getBalance() * 0.02;   // 2% interest
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan applied for Current Account");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 8;
    }
}

