public class Pelle {
    static int[] history;
    public static int f(int n) {
        if (history[n] != 0) {
            return history[n];
        }
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        history[n] = f(n-1) + f(n-2);
        return history[n];

    }
    public static void main(String[] args) {
        history = new int[1000];
        System.out.println(f(1));
        System.out.println(f(5));
        System.out.println(f(10));
        System.out.println(f(100));
    }
}
