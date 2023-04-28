package day34_b_encapsulation.static_imoprt;

import static java.util.Arrays.sort;


    public class WithWilder {
        public static void main(String[] args) {
            int[] a = {1, 2, 3, 4, 5};

            sort(a);// since we have done the static import we can call the method by the name only.

        }
    }

