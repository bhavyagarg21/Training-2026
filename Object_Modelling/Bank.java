import java.util.*;

class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer customer, double initialBalance) {
        customer.addAccount(this, initialBalance);
    }
    public static void main(String[] args) {

        Bank sbi = new Bank("jk");
        Bank hdfc = new Bank("rty");

        Customer c1 = new Customer("xyz");

        sbi.openAccount(c1, 5000);
        hdfc.openAccount(c1, 12000);

        c1.viewBalance();
    }
}

class Customer {
    String name;
    ArrayList<Bank> banks = new ArrayList<>();
    ArrayList<Double> balances = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addAccount(Bank bank, double balance) {
        banks.add(bank);
        balances.add(balance);
    }

    void viewBalance() {
        System.out.println("Balances for " + name);
        for (int i = 0; i < banks.size(); i++) {
            System.out.println(
                banks.get(i).bankName + " : " + balances.get(i)
            );
        }
    }
}
