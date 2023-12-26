public class Hellos {

    public static void printHellos(int n) {
//        if( n > 0) {
            System.out.println(n + " Hello");
            printHellos(n - 1);
//        }
    }
    public static void main(String[] args) {
        int n = 2;
        printHellos(n);
    }
}
