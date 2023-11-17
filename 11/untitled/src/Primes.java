public class Primes {
    public static void main(String[] args) {
        int n = 100;
        boolean[] isPrime = new boolean[n+1];
        for(int i = 1; i <= n; i++) {
            isPrime[i] = true;
        }
        isPrime[1] = false;
        for(int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 1; i <= n; i++) {
            if(isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
