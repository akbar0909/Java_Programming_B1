package day22_arrays;

import java.util.Arrays;

public class ArrayTosting {

    public static void main(String[] args) {

//        char [] elements = {'A', 'S','D','f','H','L'};
//        System.out.println(Arrays.copyOfRange( elements, 0, 6));

        int[] score = {9, 4, 5, 2, 4, 6};
//        int[]score2 = Arrays.copyOf( score, 3);
//        System.out.println(Arrays.toString(score2));
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));

    }
}
