package shapes;

public class Rectangle extends Shape {
    int tool, arz;

    public Rectangle(int tool, int arz) {
        super(0, 0);
        this.tool = tool;
        this.arz = arz;
    }

    public double area() {
        return tool * arz;
    }

    public int getTool() {
        return tool;
    }

    public int getArz() {
        return arz;
    }



    @Override
    public String toString() {
        return "Rectangle(tool:" + tool + ", arz:" + arz + ")";
    }
}
