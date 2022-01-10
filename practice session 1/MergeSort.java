public class MergeSort {
    public static int[] sort(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return arr;
        }

        int mid = n / 2;
        int[] left_arr = new int[mid];
        int[] right_arr = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left_arr[i] = arr[i];
        }

        for (int j = 0; j < n - mid; j++) {
            right_arr[j] = arr[mid + j];
        }

        int[] left_sorted_arr = sort(left_arr);
        int[] right_sorted_arr = sort(right_arr);
        int[] sorted_arr = new int[n];

        int left_idx = 0;
        int right_idx = 0;
        int tot_idx = 0;

        while (left_idx < left_sorted_arr.length && right_idx < right_sorted_arr.length) {
            if (left_sorted_arr[left_idx] >= right_sorted_arr[right_idx]) {
                sorted_arr[tot_idx] = right_sorted_arr[right_idx];
                right_idx += 1;
            } else {
                sorted_arr[tot_idx] = left_sorted_arr[left_idx];
                left_idx += 1;
            }
            tot_idx += 1;
        }

        while (left_idx < left_sorted_arr.length) {
            sorted_arr[tot_idx] = left_sorted_arr[left_idx];
            left_idx += 1;
            tot_idx += 1;
        }

        while (right_idx < right_sorted_arr.length) {
            sorted_arr[tot_idx] = right_sorted_arr[right_idx];
            right_idx += 1;
            tot_idx += 1;
        }

        return sorted_arr;

    }

    public static void printArr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 50, 40, 30, 20, 10, 1 };
        int[] sorted_arr = sort(arr);
        printArr(sorted_arr);
    }

}
