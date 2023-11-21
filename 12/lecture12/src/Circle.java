public class Circle {
    int x0;
    int y0;
    double radius;

    double masahat() {
        return Math.PI * radius * radius;
    }

    double mohit() {
        return 2 * radius * Math.PI;
    }

    void scaleTwo() {
        radius *= 2;
    }

    void scale(int k) {
        radius *= k;
    }
//
//    void move(int x, int y) {
//
//    }
//
//    Circle anotherCircleAndMoveOne() {
//
//    }



}
