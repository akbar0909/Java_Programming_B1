package day07_relational_operator;

public class OperatorPractice2 {
    public static void main(String[] args) {


        int a = 1;
        int b = -a-- + a++ / -a-- * --a;
        System.out.println( a);
        System.out.println(b);
    }
}
