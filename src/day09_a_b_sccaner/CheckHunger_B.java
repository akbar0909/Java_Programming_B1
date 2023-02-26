package day09_a_b_sccaner;

import java.util.Scanner;

public class CheckHunger_B {
    /*

    boolean variable isHungry

            if the person is hungry,print: You are hungry, so I will get some food for you

            if the person is not hungry, print: Great, then practice java

     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("you are hungry (true or false):");
        boolean isHungry = input.nextBoolean();


        if (isHungry) {
            System.out.println("let's go Texas DeBrazil");
        } else {

            System.out.println("i can stay without eating anything. Give me something at least");
        }


    }
}
