public class BubbleSort {
    public static int[] sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void printArr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.err.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 50, 40, 30, 20, 10, 1 };
        int[] sorted_arr = sort(arr);
        printArr(sorted_arr);
    }

}
