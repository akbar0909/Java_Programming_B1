package day3_comment_escape_sequence;

public class TabAndNextLine {

    public static void main(String[] args) {
        //This is without any tab
        System.out.println( " this not tabbed  ");

        // this is with tab
        System.out.println(" \t this is with tab"); // one tab equal 4 space

        // here is it tabbed without escape sequence
        System.out.println( "         this is it tabbed \n without escape sequence  ");

        // example of next line
        System.out.println();
        System.out.println(" 1) go to store ");
        System.out.println( " 2) grab milk ");
        System.out.println(  "3) wash car ");

        System.out.println("\n1) Go to store \n 2) grab milk \n 3) wash  car ");



    }
}
