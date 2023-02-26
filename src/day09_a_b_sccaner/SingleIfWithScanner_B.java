package day09_a_b_sccaner;

import java.util.Scanner;

public class SingleIfWithScanner_B {

    public static void main(String[] args) {
        //create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Why are we studying Java? ");
        String answer = input.nextLine();

        System.out.println("Is Java fun (true or false)? ");
        boolean answer2 = input.nextBoolean();


        if (answer2) {
            System.out.println("Feyruz is really happy");
        }

        //
        if (!answer2) {
            System.out.println("Turn your camera on it time to be grilled");
        }
    }




}
