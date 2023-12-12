import shapes.LongRectangle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Square;
import shapes.Circle;

public class Main {
    public static void main(String[] args) {
        Shape[] a = new Shape[4];
        Shape x = new Square(5);
//        x.getEdge();
        x.area();
        x = new Rectangle(2, 3);
        x.area();

//        a[0] = new Shape();
        a[0] = new Rectangle(4, 6);
        a[1] = new Square(4);
        a[2] = new LongRectangle(10);
        a[3] = new Circle(1, 5, 10);
//        System.out.println(((Circle)a[2]).getRadius());
        System.out.println(((Circle)a[3]).getRadius()); // type cast
        for(int i = 0; i < a.length; i++) {
            System.out.println("======== " + i + " =========");
            System.out.println("class name: " + a[i].getClass().getName() );
            System.out.println("area: " + a[i].area());
            System.out.println("is Object : " + (a[i] instanceof Object));
            System.out.println("is Shape : " + (a[i] instanceof Shape));
            System.out.println("is Rectangle : " + (a[i] instanceof Rectangle));
            System.out.println("is Square : " + (a[i] instanceof Square));
            System.out.println("is LongRectangle : " + (a[i] instanceof LongRectangle));
            System.out.println("is Circle : " + (a[i] instanceof Circle));
//            a[i].getRadius();
        }
    }
}
