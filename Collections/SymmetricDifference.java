import java.util.*;

public class SymmetricDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < m; i++) {
            set1.add(sc.nextInt());
        }

        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set2.add(sc.nextInt());
        }

        Set<Integer> result = new HashSet<>();

        for (int x : set1) {
            if (!set2.contains(x)) {
                result.add(x);
            }
        }

        for (int x : set2) {
            if (!set1.contains(x)) {
                result.add(x);
            }
        }

        System.out.println(result);
        sc.close();
    }
}
