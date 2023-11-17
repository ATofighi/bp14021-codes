import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("a: ");
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += a[i];
        }
        double avg = 1.0 * sum / n;
        System.out.println("avg: " + avg);

        double[] b = new double[n];
        for(int i = 0; i < n; i++) {
            b[i] = a[i] - avg;
        }

        System.out.print("b: ");
        for(int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        double sum2 = 0;
        for(int i = 0; i < n; i++) {
            sum2 += b[i]*b[i];
        }
        System.out.println("Var: " + (sum2/n));

    }
}
