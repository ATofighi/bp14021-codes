import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while ( i < 100) {
            System.out.println((int)(40 * Math.random()));
            i ++;
        }
//        int r = (int)(100 * Math.random());
//        boolean isFinished = false;
//        while(!isFinished) {
//            System.out.print("Enter x: ");
//            int x = sc.nextInt();
//            if (x < r) {
//                System.out.println("x < r");
//            } else if (x > r) {
//                System.out.println("x > r");
//            } else {
//                System.out.println("Afriiin!!!");
//                isFinished = true;
//            }
//        }
    }
}
