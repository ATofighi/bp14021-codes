public class Main {
    int r;
    public static void main(String[] args) {
        Main m = new Main();
        m.r = 7;
        System.out.println(m.r);
        Main.increase(m);
        System.out.println(m.r);
    }

    public static void increase(Main x) {
        x.r++;
    }
    public void increase(int x) {
        x++;
    }

    private static int min(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

}