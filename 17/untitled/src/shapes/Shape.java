package shapes;

public abstract class Shape extends Object {
    private int centerX;
    private int centerY;

    public Shape(int centerX, int centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

//    public int area() {
//        return 0;
//    }
    public abstract double area();

    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }
}
