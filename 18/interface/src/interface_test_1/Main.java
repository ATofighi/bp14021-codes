package interface_test_1;

public class Main {
    public static void main(String[] args) {
        LessThanAble p1 = new Pair(2, 3);
        LessThanAble p2 = new Pair(5, 1);
        System.out.println(p1.isLessThan(p2));
        System.out.println(p2.isLessThan(p1));
//        System.out.println(p2.isLessThan(5));

        System.out.println("===========");
        LessThanAble t1 = new Triple(3, 3, 3);
        LessThanAble t2 = new Triple(3, 3, 2);
        System.out.println(t1.isLessThan(t2));
        System.out.println(t2.isLessThan(t1));
        System.out.println(t1.isLessThan(p1));

    }
}
