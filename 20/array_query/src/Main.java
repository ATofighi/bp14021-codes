import java.util.Scanner;

public class Main {

    public static boolean isPrime(int x)
        throws NegativeException
    {
        if (x < 0) {
            throw new NegativeException(x);
        }
        for(int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try {
            isPrime(10);
        } catch (NegativeException e) {
            e.printStackTrace();
        }
//        int[] a = new int[]{4, 5, 2, 7, 5};
//        Scanner sc = new Scanner(System.in);
//        try {
//            int x = sc.nextInt();
//            System.out.println(isPrime(x));
////            int p1 = a[x];
////            int p2 = 1/x;
////            System.out.println(p1);
////            System.out.println(p2);
////
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//            System.out.println("out of bound");
//        } catch (ArithmeticException e) {
//            System.out.println("/ error");
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("unknown error");
//        }
//        System.out.println("After try/catch");
    }
}