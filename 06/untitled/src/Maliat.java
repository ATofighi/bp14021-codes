import java.util.Scanner;

public class Maliat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hoghoogh = sc.nextDouble();
        System.out.println(hoghoogh);
        if (hoghoogh < 6) {
            System.out.println(0);
        } else if (hoghoogh < 15) {
            System.out.println((hoghoogh-6)*0.1);
        } else {
            System.out.println((15-6)*0.1 + (hoghoogh - 15) * 0.15);
        }
    }
}
