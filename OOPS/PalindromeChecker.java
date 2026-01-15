import java.util.Scanner;

class PalindromeChecker {
    String text;
    PalindromeChecker(String text) {
        this.text = text;
    }
    boolean isPalindrome() {
        int i = 0;
        int j = text.length() - 1;

        while (i < j) {
            if (text.charAt(i) != text.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    void displayResult() {
        if (isPalindrome()) System.out.println(text + " is a Palindrome");
        else System.out.println(text + " is not a Palindrome");
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text=sc.nextLine();
        PalindromeChecker pc = new PalindromeChecker(text);
        pc.displayResult();
        sc.close();
    }
}

