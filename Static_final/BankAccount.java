public class BankAccount {
    String accountHolderName;

    final String accountNumber;

    static String bankName= "ABC Bank";
    static int totalAccounts = 0;

    BankAccount(String accountHolderName,String accountNumber){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        totalAccounts++;
    }
    
    static int getTotalAccounts(){
        return totalAccounts;
    }
    public void displayDetails(){
        if(this instanceof BankAccount){
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Bank Name: " + bankName);
        } 
        else System.out.println("Not a BankAccount object");
    }
    public static void main(String[] args){
        BankAccount acc1=new BankAccount("xyz", "A101");
        acc1.displayDetails();
        System.out.println("Total accounts: "+BankAccount.getTotalAccounts());
    }
}
