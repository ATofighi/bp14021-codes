public class Pair extends Object implements Comparable<Pair>  {
    private int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair o) {
        if (o.x != x) {
            if(x > o.x) {
                return 1;
            }
            if(x < o.x) {
                return -1;
            }
        }
        else {
            if(y > o.y) {
                return 1;
            } else if (y < o.y) {
                return -1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
