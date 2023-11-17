import java.util.Scanner;

public class SimpleWhile {
    public static void main(String[] args) {
        // ورودی: عدد n
        // خروجی: اعداد زوج ۰ تا n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while (2 * i <= n) {
            System.out.println(2 * i);
            i++;
        }
//        while (i <= n) {
//            System.out.println(i);
//            i += 2;
//        }
//
//        while (i <= n) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i = i + 1;
////            i++;
////            i += 1;
//        }
    }
}
