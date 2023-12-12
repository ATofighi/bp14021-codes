import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        String[] a = new String[]{
                "ali",
                "Ali",
                "a",
                "zzdsa",
                "ab",
                "0124542",
                "mammad",
                "Zahra",
        };
        Arrays.sort(a, new ReverseStringComparator());
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
