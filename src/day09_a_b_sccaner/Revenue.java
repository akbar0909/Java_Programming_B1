package day09_a_b_sccaner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {



    /* write a program that asks the user to enter a price and quantity and then calculate the revenue. revenue = price
    quantity

    */
        Scanner input=new Scanner(System.in);// java  creates an object here


    double price; // java declare a price variable that has data type of double
    int quantity;  // java declare a quantity variable that has data type of int
        System.out.println("Enter the price and quantity: ");
        price=input.nextDouble();   // java ask user to put input/info/value then assign that value to price value
        quantity = input.nextInt();  // java ask user to put input/info/value then assign that value to price value

        double revenue = price * quantity;


        System.out.println("Your revenue : " + revenue);

        System.out.println();
        System.out.println(price);
        System.out.println(quantity);

        //System.out.println("Enter the price");
        //System.out.println("Enter the quantity:");






    }



}
