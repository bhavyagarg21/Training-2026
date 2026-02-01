import java.util.*;
public class UnionIntersection {
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

        Set<Integer> union = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int x : set1) {
            union.add(x);
        }

        for (int x : set2) {
            if (union.contains(x)) {
                intersection.add(x);
            } else {
                union.add(x);
            }
        }

        System.out.println(union);
        System.out.println(intersection);

        sc.close();
    }
}
