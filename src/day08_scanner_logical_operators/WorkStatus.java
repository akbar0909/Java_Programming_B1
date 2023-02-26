package day08_scanner_logical_operators;

import java.util.Scanner;

/* create Scanner object
        ask the user to enter their first name - next
        ask the user to enter their last name - next
        ask the user if they are employed - boolean
        ask the user if they are a student - boolean

 */
public class WorkStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = input.next();


        System.out.println("Enter your last name: ");
        String lastName = input.next();


        System.out.println("How are you ");
        String greeting = input.next();


        System.out.println( "\n First name:\t" + firstName+ "\nlast name:\t" +lastName );



    }
    /*Scanner input =  new Scanner(System.in);
        System.out.println("Enter the year ");
    double year = input.nextDouble();
     System.out.println("What is the best team");
        String team input.next();
        System.out.println("how are you ");

     */

}
