public class JadvalZarb {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            if(i < n) System.out.println();
        }

    }
}
