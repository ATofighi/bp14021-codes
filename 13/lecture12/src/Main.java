import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        c.x0 = 5;
        c.y0 = 6;
        c.radius = 7.5;
        Circle c2 = c.birth();
        System.out.println(c);
        System.out.println(c2);
        c2.move(10, 10);
        System.out.println("===");
        System.out.println(c);
        System.out.println(c2);


//        Circle c2 = new Circle();
//        c2.radius = 1;
//        c2.x0 = -4;
//        c2.y0 = -33;

//        System.out.println(c);
////        c.move(10, -200);
//        int x = c.getX0AfterHarekat("left");
//        System.out.println("x = " + x);
//        System.out.println(c);
//        int scaleFactor = sc.nextInt();
//        System.out.println(m + ", " + c.masahat());
//        c.scaleTwo();
//        c.scale(scaleFactor);
//        System.out.println(c.mohit() + ", " + c.masahat());
    }
}