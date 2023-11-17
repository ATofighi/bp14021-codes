import java.util.Scanner;

public class SimpleWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 7, b = 8;
        System.out.println("a = " + a + ", b = " + b);

        {
            int temp = b;
            b = a;
            a = temp;
        }
        System.out.println("a = " + a + ", b = " + b);
        {
            int temp = b;
            b = a;
            a = temp;
        }
        System.out.println("a = " + a + ", b = " + b);
    }
}
