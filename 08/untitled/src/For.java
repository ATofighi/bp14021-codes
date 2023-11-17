public class For {
    public static void main(String[] args) {
        int n = 53;
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
            System.out.println("i=" + i + ", sum=" + sum);

        }
        System.out.println(sum);
    }
}
