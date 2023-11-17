import java.util.Scanner;

public class BreakString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // ورودی: abcd
        // خروجی:
        // a
        // b
        // c
        // d
        int i = 0;
        while (i < s.length()) {
            System.out.print(s.charAt(s.length() - i - 1));
            i++;
        }
//        System.out.println(s.charAt(0));
//        System.out.println(s.charAt(1));
    }
}
