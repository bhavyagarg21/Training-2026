public class BankAccount {
    String accountNumber;
    double balance;
    BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public static void main(String[] args){
        CheckingAccount b1=new CheckingAccount("1528934", 30000, 15000);
        b1.displayAccountType();

        SavingsAccount b2=new SavingsAccount("1528934", 30000, 3);
        b2.displayAccountType();

        FixedDepositAccount b3=new FixedDepositAccount("1528934", 30000, 5000);
        b3.displayAccountType();
    }
    
}
class SavingsAccount extends BankAccount{
    double interestRate;
    SavingsAccount(String accountNumber,double balance,double interestRate){
        super(accountNumber, balance);
        this.interestRate=interestRate;
    }
    void displayAccountType(){
        System.out.println("This is a savings account");
    }
}
class CheckingAccount extends BankAccount{
    double withdrawalLimit;
    CheckingAccount(String accountNumber,double balance,double withdrawalLimit){
        super(accountNumber, balance);
        this.withdrawalLimit=withdrawalLimit;
    }
    void displayAccountType(){
        System.out.println("This is a checking account");
    }
}
class FixedDepositAccount extends BankAccount{
    double minDeposit;
    FixedDepositAccount(String accountNumber,double balance,double minDeposit){
        super(accountNumber, balance);
        this.minDeposit=minDeposit;
    }
    void displayAccountType(){
        System.out.println("This is a fixed deposit account");
    }
}
