
public class QuickSort {

    public static int[] sort(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return arr;
        }

        int pivot = arr[0];

        int[] left_arr = new int[n];
        int[] right_arr = new int[n];

        int left_idx = 0;
        int right_idx = 0;

        for (int i = 1; i < n; i++) {
            if (pivot >= arr[i]) {
                left_arr[left_idx] = arr[i];
                left_idx += 1;
            } else {
                right_arr[right_idx] = arr[i];
                right_idx += 1;
            }
        }
        printArr(left_arr);
        printArr(right_arr);

        int[] left_arr_tmp = new int[left_idx];
        int[] right_arr_tmp = new int[right_idx];

        for (int p = 0; p < left_idx; p++) {
            left_arr_tmp[p] = left_arr[p];
        }

        for (int q = 0; q < right_idx; q++) {
            right_arr_tmp[q] = right_arr[q];
        }

        int[] left = sort(left_arr_tmp);
        int[] right = sort(right_arr_tmp);

        int[] sorted_arr = new int[n];

        for (int j = 0; j < left.length; j++) {
            sorted_arr[j] = left[j];
        }

        sorted_arr[left.length] = pivot;

        for (int k = 0; k < right.length; k++) {
            sorted_arr[left.length + 1 + k] = right[k];
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
        int[] sample_arr = { 50, 40, 30, 20, 10 };
        int[] sorted_arr = sort(sample_arr);
        printArr(sorted_arr);
    }
}
