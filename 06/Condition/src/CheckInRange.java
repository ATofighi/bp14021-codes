import java.util.Scanner;

public class CheckInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(),
                l = 5,
                r = 10;
//        boolean check = x >= l && x < r;
        if (x >= l && x < r) {
            System.out.println(x + " is in range [" + l + ", " + r + ")");
        }
        else if (x >= r + 100) {
            System.out.println(x + " is too large");
        }
        else if (x < l - 100) {
            System.out.println(x + " is too small");
        } else {
            System.out.println("It is not in range");
        }












        //        boolean checkLeft = x >= l;
//        boolean checkRight = x < r;
//        System.out.println(checkLeft);
//        System.out.println(checkRight);
//        System.out.println(checkLeft && checkRight);
//        System.out.println(x >= l && x < r);
//        System.out.println(x >= l && checkRight);
//  | & ^


    }
}
