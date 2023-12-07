package interface_test_1;

public class Pair extends Object implements LessThanAble {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean isLessThan(LessThanAble o) {
        if (o instanceof Pair) {
            Pair p = (Pair)o;
            if (x < p.x) {
                return true;
            }
            if (x > p.x) {
                return false;
            }
            return y < p.y;
        } else {
            return false;
        }
    }
}
