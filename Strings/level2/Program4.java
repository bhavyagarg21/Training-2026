import java.util.*;
public class Program4 {
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

    public static int[] findShortestLongest(String[][] arr) {

        int min = Integer.parseInt(arr[0][1]);
        int max = Integer.parseInt(arr[0][1]);
        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);

            if (len < min) {
                min = len;
                minIndex = i;
            }

            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text:");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] table = wordLength2D(words);

        int[] result = findShortestLongest(table);

        System.out.println("\nShortest Word: " + table[result[0]][0] +
                " (Length: " + table[result[0]][1] + ")");

        System.out.println("Longest Word: " + table[result[1]][0] +
                " (Length: " + table[result[1]][1] + ")");

        sc.close();
    }
}
