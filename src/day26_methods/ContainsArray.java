package day26_methods;

public class ContainsArray {

    public static boolean containArr(int[] arr, int num) { // [ 2, 4, 6 ,8, 9, 10}, 4

        //   boolean result = false;
        for (int each : arr) {
            if (each == num) {
//                return  = true;
//                break;
                return true;
            }
        }
        // return result
        return false;
    }



    public static void main(String[] args) {

        int [] arr = { 1, 2, 3 ,66, 81,};
        int num = 5;
    }
}