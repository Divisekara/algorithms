public class MergeSort {

    public static int[] sort(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return arr;
        }

        int mid = n / 2;
        int[] left_arr = arr[0::mid];
        int[] right_arr = arr[0::mid];

        printArr(left_arr);
        printArr(right_arr);

        return left_arr;

    }

    public static void printArr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] sample_arr = { 32, 23, 20, 17, 13, 10, 5, 1 };
        int[] sorted_arr = sort(sample_arr);
        printArr(sorted_arr);
    }
}
