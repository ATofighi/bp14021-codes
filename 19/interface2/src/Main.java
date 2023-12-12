import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pair[] a = new Pair[]{
                new Pair(2, 5),
                new Pair(6, 2),
                new Pair(1, 10),
                new Pair(6, 1),
        };
        Arrays.sort(a);


        for(int i = 0; i < a.length; i++) {
            System.out.println(i + ": " + a[i]);
        }
    }
}