import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        // ورودی: یک عدد بگیرد
        // خروجی بگوید اول است یا نیست.
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = 1;
        while (n <= k) {
            boolean isPrime = true;
            if (n == 1) {
                isPrime = false;
            } else {
                int i = 2;
//                while (i < n) {
                while (i*i <= n) {
                    if (n % i == 0) {
                        isPrime = false;
                    }
                    i++;
                }
            }
            if (isPrime) {
                System.out.println(n);
            }


            n++;
        }

    }
}
