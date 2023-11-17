import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean x1, x2;
        String question = sc.nextLine();
        x1 = question.equals("yes");
        question = sc.nextLine();
        x2 = question.equals("yes");
        System.out.println(x1 == x2);
    }
}
