package interface_test_1;

public class Triple  implements LessThanAble {
    private int x;
    private int y;
    private int z;

    public Triple(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean isLessThan(LessThanAble o) {
        if (o instanceof Triple) {
            Triple t = (Triple) o;
            if (t.x != x) {
                return x < t.x;
            }
            if (t.y != y) {
                return y < t.y;
            }
            return z < t.z;
        }
        return false;
    }
}
