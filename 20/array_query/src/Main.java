import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{4, 5, 2, 7, 5};
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int x = sc.nextInt();
            try {
                System.out.println(a[x]);
                System.out.println(1 / x);
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                System.out.println("out of bound");
            } catch (ArithmeticException e) {
                System.out.println("/ error");
            } catch (Exception e) {
                System.out.println("unknown error");
            }
        }
    }
}