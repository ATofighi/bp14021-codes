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

    void move(int x, int y) {
        x0 += x;
        y0 += y;
    }

    int getX0AfterHarekat(String jahat) {
        if (jahat.equals("right")) {
            return x0 + 1;
        }
        else if (jahat.equals("left")){
            return x0 - 1;
        }
        return x0;
    }


    int[] getX0Y0AfterHarekat(String jahat) {
        int[] x1y1 = new int[2];
        x1y1[0] = x0;
        x1y1[1] = y0;
        if (jahat.equals("right")) {
            x1y1[0] = x0 + 1;
        }
        else if (jahat.equals("left")){
            x1y1[0] = x0 - 1;
        }
        else if (jahat.equals("up")) {
            x1y1[1] = y0 + 1;
        }
        else if (jahat.equals("down")) {
            x1y1[1] = y0 - 1;
        }
        return x1y1;
    }

    Circle birth() {
        Circle c = new Circle();
        c.x0 = x0 + 1;
        c.y0 = y0 + 1;
        c.radius = radius;
        return c;
    }



    public String toString() {
        // Circle[(4, 6), 5.4]
        return "Circle[(" + x0 + ", " + y0 + "), " + radius + "]";
    }
}
