public class StringToCharArray {
    public
    static void main(String[] args) {
        String s = "Introduction to programming";
//        System.out.println(s.length());
        int[] arr = new int[27];

        for(int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        System.out.println(arr);
//
////        for(int i = 0; i < s.length(); i++) {
////            System.out.print(arr[i]);
////        }
    }
}
