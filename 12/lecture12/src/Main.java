import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        c.x0 = 5;
        c.y0 = 6;
        c.radius = 7.5;

        Circle c2 = new Circle();
        c2.radius = 1;
        c2.x0 = -4;
        c2.y0 = -33;

        double m = c.mohit();
        int scaleFactor = sc.nextInt();
        System.out.println(m + ", " + c.masahat());
//        c.scaleTwo();
        c.scale(scaleFactor);
        System.out.println(c.mohit() + ", " + c.masahat());
    }
}