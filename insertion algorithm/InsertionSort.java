// import java.io.ObjectInputFilter.Status;
// import java.util.*;
// import java.util.regex.Pattern;

public class InsertionSort {

    public static int[] sort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int key = arr[i];

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                // printArray(arr);
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] sample_arr = { 20, 15, 10, 5, 1 };
        printArray(sample_arr);

        int[] sorted_arr = sort(sample_arr);
        printArray(sorted_arr);
    }
}