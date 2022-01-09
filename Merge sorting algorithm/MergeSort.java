public class MergeSort {

    public static int[] merge(int[] arr1, int[] arr2) {

        int arr1_idx = 0;
        int arr2_idx = 0;

        int[] sorted_arr = new int[arr1.length + arr2.length];

        int idx = 0;
        while (arr1_idx < arr1.length && arr2_idx < arr2.length) {
            if (arr1[arr1_idx] <= arr2[arr2_idx]) {
                sorted_arr[idx] = arr1[arr1_idx];
                arr1_idx += 1;
            } else {
                sorted_arr[idx] = arr2[arr2_idx];
                arr2_idx += 1;
            }
            idx += 1;
        }

        while (arr1_idx < arr1.length) {
            sorted_arr[idx] = arr1[arr1_idx];
            arr1_idx += 1;
            idx += 1;
        }

        while (arr2_idx < arr2.length) {
            sorted_arr[idx] = arr2[arr1_idx];
            arr2_idx += 1;
            idx += 1;
        }

        return sorted_arr;
    }

    public static int[] sort(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return arr;
        }

        int mid = n / 2;
        int[] left_arr = new int[mid];
        int[] right_arr = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left_arr[i] = arr[i];
        }

        for (int j = 0; j < n - mid; j++) {
            right_arr[j] = arr[j + mid];
        }

        int[] sorted_arr = merge(sort(left_arr), sort(right_arr));

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
        int[] sample_arr = { 32, 23, 20, 17, 13, 10, 7, 5, 1 };
        int[] sorted_arr = sort(sample_arr);
        printArr(sorted_arr);
    }
}
