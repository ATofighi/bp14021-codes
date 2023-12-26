public class CountBalls {
    public static int count(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n + count(n-1) + count(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(count(20));
    }
}
