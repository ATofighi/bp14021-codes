import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int sum = 0;
        a = sc.nextInt();
        sum = sum + a;
        a = sc.nextInt();
//        sum = sum + a;
//        while(sc.hasNextInt()) {
//            a = sc.nextInt();
//            sum = sum + a;
//        }

        System.out.println(sum);


    }
}
