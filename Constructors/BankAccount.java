class BankAccount {
    public String accountNumber;     
    protected String accountHolder;  
    private double balance;          

    BankAccount(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance=balance;
    }
    public void setBalance(double newBalance){
        balance = newBalance;
    }

    public double getBalance(){
        return balance;
    }
    public static void main(String[] args){
        SavingsAccount sa = new SavingsAccount("ACC202", "Bob",10000);

        sa.displayAccountInfo();
        sa.setBalance(12000);
        System.out.println("\nAfter updating balance:");
        sa.displayAccountInfo();
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(String accountNumber, String accountHolder, double balance){
        super(accountNumber, accountHolder,balance);
    }

    void displayAccountInfo(){
        System.out.println("Account Number: " + accountNumber);   
        System.out.println("Account Holder: " + accountHolder);   
        System.out.println("Balance: " + getBalance());           
    }
}

