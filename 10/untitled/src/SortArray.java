import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        // ورودی: یک آرایه از اعداد
        // خروجی: یک آرایه‌ی مرتب شده
//        int[] a = new int[]{5, 4, 3, 2, 1};
//        // a[0] = minimum
//        // a[1]
//        // a[2]
//        // ..
//        // a[4] = maximum
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for(int j = 0; j < a.length; j++){
            int index = j;
            for (int i = j; i < a.length; i++) {
                if (a[i] < a[index]) {
                    index = i;
                }
            }
            int temp = a[index];
            a[index] = a[j];
            a[j] = temp;
        }
        System.out.print("array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }

}
