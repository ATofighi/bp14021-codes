public class Sort {
    public static void sortInPlace(int[] array, int l, int r) {
        if (r - l <= 1) {
            return;
        }
        {
            int random = (int)(Math.random()*(r-l)) + l;
            int temp = array[random];
            array[random] = array[l];
            array[l] = temp;
        }
        int p = l;
        for(int i = l+1; i < r; i++) {
//            System.out.println(i + ":, p = " + p);
//            for(int x: array) {
//                System.out.print(x + " ");
//            }
//            System.out.println();
            if(array[i] <= array[p]) {
                int temp = array[p+1];
                array[p+1] = array[i];
                array[i] = temp;

                temp = array[p+1];
                array[p+1] = array[p];
                array[p] = temp;
                p++;
            }
        }

        sortInPlace(array, l, p);
        sortInPlace(array, p+1, r);
    }

    public static void main(String[] args) {
        int[] a = new int[]{5, 3, 9, 2, 6, 1};
        sortInPlace(a, 0, a.length);
        for(int x: a) {
            System.out.print(x + " ");
        }
    }
}
