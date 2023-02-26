package day3_comment_escape_sequence;

public class quote {
    public static void main(String[] args) {
        // the code prints this quote --> I like "Java" programming
        System.out.println("I like \"Java\" programming  ");
        System.out.println("\" this is quote\" ");
        /* First quote  is before java printing the text
        the second quote is to print the " quotation mark in the console

         */
        // I want to print backlash
        System.out.println("abc\\def"); // this will print one backlash
        /*
        The first backlash for the syntax for the syntax of escape characters

        the second backlsh for the backlash character to put character

         */

        System.out.println("a|c\\\\def");
        System.out.println("abc\\\"def");
        System.out.println("abc/def");

    }

}
