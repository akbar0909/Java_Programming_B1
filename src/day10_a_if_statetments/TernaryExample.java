package day10_a_if_statetments;

public class TernaryExample {
    public static void main(String[] args) {
         int a =3;
         String evenOrOdd;

         if(a % 2 == 0) {
             evenOrOdd = "even";
         } else {
             evenOrOdd = "Odd";
        }
         System.out.println(evenOrOdd);


        System.out.println("---------------------------------");



        String evenOrOdd2 = (a % 2 == 0) ?  "Even" : "Odd";

        System.out.println(evenOrOdd2);
    }
}
