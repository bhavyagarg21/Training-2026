import java.util.*;
public class Program1 {
    public static int findLength(String s) {
        int count = 0;
        char[] arr=s.toCharArray();
        for(char c:arr) count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();

        int length = findLength(str);
        System.out.println("Length using user-defined method: " + length);

        int builtInLength = str.length();
        System.out.println("Length using built-in method: " + builtInLength);

        sc.close();
    }
}

