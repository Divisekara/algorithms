public class BubbleSort {

    public static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int right = arr[j + 1];
                    int left = arr[j];
                    arr[j] = right;
                    arr[j + 1] = left;
                }
            }
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
        int[] sample_arr = { 25, 20, 15, 10, 3, 1 };
        int[] sorted_arr = sort(sample_arr);
        printArr(sorted_arr);
    }

}
