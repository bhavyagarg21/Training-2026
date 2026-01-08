import java.util.*;
public class Program3 {
    public static int findLength(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            count++;
        }
        return count;
    }

    public static String[] splitWords(String s) {
        int spaceCount = 0;
        for (int i = 0; i < findLength(s); i++) {
            if (s.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int wordCount = spaceCount + 1;
        String[] words = new String[wordCount];
        int start = 0, index = 0;
        for (int i = 0; i < findLength(s); i++) {
            if (s.charAt(i) == ' ') {
                words[index++] = s.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = s.substring(start);
        return words;
    }
    public static String[][] wordLength2D(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text:");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] table = wordLength2D(words);

        System.out.println("\nWord\tLength");

        for (int i = 0; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]); // Convert String to Integer
            System.out.println(table[i][0] + "\t" + len);
        }

        sc.close();
    }
}
