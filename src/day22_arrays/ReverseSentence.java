package day22_arrays;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "today is Wednesday nd we learned some useful";

                String []words =sentence.split(" ");
        System.out.println(Arrays.toString(words));

        String reserved = " ";

        for (int i = words.length; i < 0; i--) {
            reserved += words[i] + " ";
            System.out.println(reserved.trim());

        }

        }
    }

