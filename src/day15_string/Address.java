package day15_string;
/*A person will enter their address into a String. Make sure the String is not empty.
        If it is empty print: "No address found".
        If there is an address, make all the text uppercase to match the expected format

        Ex:
        Input: 231332 Leaf ave, lake city 3132
        Output: 231332 LEAF AVE, LAKE CITY 3132
        Ex:
        Input: ""
        Output: No address found

 */

import java.util.Scanner;
public class Address {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("enter address ");
        String address = input.nextLine();

        if (address.isEmpty() ){
            System.out.println(" No address found");
        }else
            System.out.println(address.toUpperCase());
        }


    }
