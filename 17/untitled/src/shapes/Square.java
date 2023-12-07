package shapes;

public class Square extends Rectangle {
    public Square(int edge) {
        // this
        super(edge, edge);


    }
    public int getEdge() {
        return getTool();
    }

    public String toString() {
        return "Square->" + super.toString();
    }
}
