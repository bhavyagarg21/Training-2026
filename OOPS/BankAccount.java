import java.util.Scanner;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String accHolder, int accNum,double balance){
        accountHolder=accHolder;
        accountNumber=accNum;
        this.balance=balance;
    } 
    double deposit(double amount){
        if(amount<=0){
            System.out.println("Amount can't be deposited");
            return balance;
        }
        balance+=amount;
        return balance;
    }
    double withdraw(double amount){
        if(amount<=0){
            System.out.println("Amount can't be withdrawn");
            return balance;
        }
        if(balance>=amount) balance-=amount;
        else System.out.println("insufficient balance");
        return balance;
    }

    void displayBalance(){
        System.out.println("Balance: "+ balance);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String accountHolder=sc.nextLine();
        int accountNumber=sc.nextInt();
        double balance= sc.nextDouble();

        BankAccount b1=new BankAccount(accountHolder, accountNumber, balance);

        System.out.println("Amount to deposit: ");
        double amount1=sc.nextDouble();
        b1.deposit(amount1);

         System.out.println("Amount to withdraw: ");
        double amount2=sc.nextDouble();
        b1.withdraw(amount2);

        b1.displayBalance();
        sc.close();
    }
}
