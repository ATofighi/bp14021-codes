import java.util.Scanner;

public class Log {
    public static void main(String[] args) {
        // ورودی: عدد n
        // خروجی: جزء صحیح لگاریتم عدد n در مبنای ۲ چقدر است؟
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        while(n > 1) {
            n /= 2; // n = n / 2
            k++; // k += 1  // k = k + 1
        }
        System.out.println(k);

    }
}
