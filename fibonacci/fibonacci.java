public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");

        int c;

        int n = 5;
        int i = 0;

        while (i < n - 2) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
            i++;
        }
    }
}
