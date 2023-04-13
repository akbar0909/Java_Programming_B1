package my_util;

import java.util.Arrays;

public class ArrayUtil {
    /**
     * This method accept int arr and return int the min number
     */


    public static int minNumInArr(int[] arr) {
        int min = 0;

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    /**
     * This method will accept an int array
     * And will return the minium number
     */

    public static int minNumInArrWithSort( int []arr){
        Arrays.sort(arr);
        return arr [0];
    }

    /** This method will accept int arr and int number
     * it will return if the number exist in the array
     */

    public static boolean containArr(int[] arr, int num) {
//        boolean result = false;
        for (int each : arr) {
            if (num == each) {
//                return = true;
                return true;
            }
        }
        return false;
//        return result;
    }



    public static void main(String[] args) {
        String str = "loop";
        int index = str.indexOf("l");


        int[] arr = {3, 1, 546, 34, 23};
        //            0  1   2    3   4
        int num = 546;

        System.out.println(indexOf2(arr, num));


        System.out.println(indexOf(arr, num));

        System.out.println(indexOf(new String[]{"apple", "loop", "Tom", "Jerry"}, "Jerry"));
    }

    public static int indexOf2(int[] arr, int num) {

        int locationOfElement = 0;
        for (int each : arr) {        // {3, 1, 546, 34, 23};   num = 444
            // 0  1   2    3   4
            if (each == num) {
                return locationOfElement;
            } else {
                locationOfElement++;
            }
        }
        return -1;
    }
    /**
     * This method will accept int arr and int number
     * and return the index of the number in the array
     * if it doesn't exist, it returns -1
     */


    public static int indexOf(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method accepts String array and a String
     * And retuns the index of String in the array
     * if daesnt exit, it returs -1
     */

    public static int indexOf(String[] arr, String word) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }
    /**
     *
     * This method accepts int number and the int array
     * And returns the new array with the number added at the beginning
     */
    public static int [] add (int [] arr, int num) {

        int [] newArr =Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = num;
        return  newArr;

        }

    /**
     *
     * This method accepts String array number and the String array
     * And returns the new array with the word added at the end
     */
    public static String [] add (String [] arr, String word) {

        String [] newArr =Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = word;
        return  newArr;

    }

    /**
     *  This method accepts int number and the int array
     *  And returns the new array with the number added at the beginning

     */

    public static int [] addElemBeginning (int num, int ... arr) {

        int [] newArr = new int[arr.length + 1];

        for (int i = 1; i < newArr.length; i++) {
            newArr[i] = arr[i-1];
        }
        newArr[0] = num;

        return newArr;
    }


    /**
     *
     * This method accepts String word and the String array
     * And returns the new array with the word added at the beginning
     */

    public static String [] addElemBeginning (String word, String ... arr) {

        String [] newArr = new String [arr.length + 1];

        for (int i = 1; i < newArr.length; i++) {
            newArr[i] = arr[i-1];
        }
        newArr[0] = word;

        return newArr;
    }
}
