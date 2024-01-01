public class OneZeros {
//    static int realK;
    public static void print01s(int n, int k, String s) {
        if ( n == 0 ) {
//            int countK = 0;
//            for(char x: s.toCharArray()) {
//                if (x == '1') {
//                    countK++;
//                }
//            }
            if (k == 0) {
                System.out.println(s);
            }
        } else {
            print01s(n - 1, k - 1, s + "1");
            print01s(n - 1, k, s + "0");
        }
    }

    public static void main(String[] args) {
        int n = 200;
        int k = 2;
//        realK = k;
        print01s(n, k, "");
    }
}
