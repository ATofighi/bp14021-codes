public class Fibonacci {
    public static void main(String[] args) {
//        int a = 0;
//        int b = 1;
//        for(int i = 0; i < 10; i++) {
//            System.out.println(a);
//            int c = a + b;
//            a = b;
//            b = c;
//        }
        int[] f = new int[100];
        int k = 10;
        f[k-1] = 1;
        for(int i = 0; i < f.length; i++) {
            if (i >= k) {
                for (int j = 1; j <= k; j++) {
                    f[i] += f[i-j];
                }
//                f[i] = f[i - 1] + f[i - 2] + ... + f[i - k];
            }
            System.out.println(f[i]);
        }
    }
}
