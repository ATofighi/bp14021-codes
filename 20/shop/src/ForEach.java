public class ForEach {
    public static void main(String[] args) {
        int[] a = new int[]{5, 3, 6, 78, 4};
        System.out.println("ali".charAt(-1));
//        for(int i = 0; i < a.length; i++) {
//            int x = a[i];
//            System.out.println(x*x);
//        }

        for(int x: a) {
            System.out.println(x*x);
        }

    }
}
