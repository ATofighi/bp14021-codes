import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        System.out.println(a);
        a.add(5);
        System.out.println(a);
        a.add(2);
        System.out.println(a);
        a.add(20);
        System.out.println(a);
        System.out.println("index 0: " + a.get(0));
        a.set(0, 50);
        System.out.println(a);
        a.remove(1);
        System.out.println(a);
    }
}
