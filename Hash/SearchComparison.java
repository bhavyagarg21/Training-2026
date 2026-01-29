import java.util.*;

class SearchComparison {
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1000000};

        for (int n : sizes) {
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = i;
            }

            int target = n - 1; 

            long start = System.nanoTime();
            linearSearch(arr, target);
            long end = System.nanoTime();
            long linearTime = end - start;

            Arrays.sort(arr);
            start = System.nanoTime();
            binarySearch(arr, target);
            end = System.nanoTime();
            long binaryTime = end - start;

            System.out.println("Dataset Size: " + n);
            System.out.println("Linear Search Time: " + linearTime / 1_000_000.0 + " ms");
            System.out.println("Binary Search Time: " + binaryTime / 1_000_000.0 + " ms");
            System.out.println();
        }
    }
}
