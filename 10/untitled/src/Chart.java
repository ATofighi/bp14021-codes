import java.util.Scanner;

public class Chart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[21];
        while(sc.hasNextInt()) {
            int x = sc.nextInt();
            a[x]++;
        }
        for(int i = 0; i <= 20; i++) {
            System.out.print(i + ":\t");
            for(int j = 0; j < a[i]; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
