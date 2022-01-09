public class SelectionSort {

    public static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min_idx] > arr[j]) {
                    min_idx = j;
                }
            }
            int key = arr[i];
            int minimum = arr[min_idx];
            arr[i] = minimum;
            arr[min_idx] = key;
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] sample_arr = { 64, 25, 12, 22, 11 };
        int[] sorted_arr = sort(sample_arr);
        printArr(sorted_arr);
    }
}
