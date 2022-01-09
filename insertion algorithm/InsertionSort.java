public class InsertionSort {

    public static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int key = arr[j];
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                printArray(arr);
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ' ');
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] sample_arr = { 20, 15, 10, 5, 1 };
        int[] sorted_arr = sort(sample_arr);
        printArray(sample_arr);
    }

}