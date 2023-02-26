package day08_scanner_logical_operators;

public class Logicall_Operation {
    public static void main(String[] args) {

/* Logical Operators

    In Math

        Q: give me a number bigger than 3 AND less than 7?

        A: 3 < myNumber < 7

            3 < 5             ---- > true
                5 < 7        ---- > true



        Q: give me a number bigger than 3 or equal AND less than 7 or equal?

        A: 3 <= myNumber <= 7


    In Java

        3 < myNumber < 7

        3 < nyNumber  AND  myNumber < 7         --- > &&  --- > it is called AND operator

 */


        int num = 20;
        System.out.println(num > 5);
        System.out.println(num < 10);
        System.out.println();

        System.out.println(num > 5 && num > 10); //true
        //                   true   &&  true


        System.out.println(num <5 && num > 10); //False
        System.out.println();
        //                   false && true


        int i = 5;
        int y = 10;

        System.out.println(y > 9 && i++ > 2); //true
        //                   true
        System.out.println(i);
        System.out.println(y > 9 && i++ > 2); //true
        System.out.println();


      i = 5;
        System.out.println(y <9 && i++ > 2); //False
        //                   false &&
        System.out.println(i);
        System.out.println();


        int x = 20;
        int w = 30;

        System.out.println(x < 5 || w++ > 20); //true
         //                 false    executed
        System.out.println(w);
        System.out.println();
        w=30;
        System.out.println(x > 5 || w++ > 20); //true
        //                  true    not executed

        System.out.println(w);


        System.out.println();

        boolean isCorrect = false;
        System.out.println(isCorrect);
        System.out.println(false);

        System.out.println(!false);
        System.out.println(!isCorrect);


    }
}
