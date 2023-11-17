import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        // ورودی: تعدادی عدد
        // خروجی: میانگین اعداد
        // اول تعداد اعدادی که ورودی می‌دهند را به دست آوریم
        // دوم جمع اعدادی که ورودی می‌دهند را به دست آوریم
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        while(scanner.hasNextInt()) {
            int x = scanner.nextInt();
            n++; // n = n + 1;
            sum += x;
//            a *= b; // a = a * b;
//            a++; a = a + 1;
//            a--;

        }
        System.out.println(1.0 * sum / n);
    }
}
