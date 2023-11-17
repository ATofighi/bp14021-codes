import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean isPrime = true;
        long i = 2;
        while(i < n) {
            if (n % i == 0) {
                isPrime = false;
                System.out.println(i);
                break;
            }
            i++;
        }
        System.out.println(isPrime);
    }
}
