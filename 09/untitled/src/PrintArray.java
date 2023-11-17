import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            int x = s.nextInt();
            a[i] = x;
        }

        for (int i = 0;i < n;i+=2) {
            System.out.print(a[i] + " ");
        }
        for (int i = 1;i < n;i+=2) {
            System.out.print(a[i] + " ");
        }
    }
}
