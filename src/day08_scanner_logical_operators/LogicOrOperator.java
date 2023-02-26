package day08_scanner_logical_operators;

public class LogicOrOperator {
    public static void main(String[] args) {

        int apples =5;
        int oranges = 10;

        System.out.println(apples>1|| oranges<5);
        System.out.println(apples>10 || oranges<10);

        int n = 20;

        System.out.println(n > 5); // true
        System.out.println(n < 10); // false

        System.out.println(n > 5 && n < 10); // true && false -> false

        System.out.println(4 > 3 || false); // true || false
        System.out.println(3 > 4 || false); // false || false

        System.out.println(!false); // not false  -> true
        System.out.println(!true); // not true -> false

        System.out.println(4 != 4);

    }
}