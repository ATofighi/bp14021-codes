import interface_test_1.LessThanAble;
import interface_test_1.Pair;

public class Main {
    public static void main(String[] args) {

        LessThanAble x;
        x = new Pair(2, 3);
        x.isLessThan(new Pair(3, 5));
    }
}