import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setWidth(-50);
//        r1.setHeight(30);
//        System.out.println(r1.getWidth());
////
//        System.out.println(r1.masahat());
//
//        Rectangle r2 = new Rectangle();
//        r1.width = 20;
//        r1.height = 100;

        Rectangle r3 = new Rectangle(-20, -70);
//        r3.width = 50;
        r3.setWidth(30); // r3.width = 30
        int x = r3.getWidth(); // int x = r3.width;

        System.out.println("width: " + r3.width);
        System.out.println("height: " + r3.getHeight());
        System.out.println("masahat: " + r3.masahat());
    }
}