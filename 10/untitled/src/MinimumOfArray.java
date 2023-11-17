public class MinimumOfArray {
    public static void main(String[] args) {
        // ورودی: یک آرایه از اعداد
        // خروجی: کوچک‌ترین عضو این آرایه
        int[] a = new int[]{43, 23, 80, 12, 633, -100,
        1,2,3,4,5,6,7,8,90,10123,123,123,123123, -3234, 45, -323499};

        int indexOfAnswer = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] < a[indexOfAnswer]) {
                indexOfAnswer = i;
            }
        }
        System.out.println("min is a[" + indexOfAnswer + "] = " + a[indexOfAnswer]);
    }
}
