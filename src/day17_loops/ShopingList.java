package day17_loops;

import java.util.Scanner;

public class ShopingList {
    public static void main(String[] args) {
        /*
    repeated steps:
        ask the user to enter the item
        add item to shopping list
        ask the user if they want to add more items

        at the end show the full shopping list

 */
        Scanner input = new Scanner(System.in);
        String list = "Shopping List:";
        String addMore = "";

        do {
            // Shopping List:
            //      Banana

            System.out.println("Enter the name of the item:");
//        String newItem = input.next();
//        list = list + "\n\t" + input.next();

            list += "\n\t" + input.next();

            System.out.println("Do you want to add more to your shopping list? ");
            addMore = input.next();  // yes , YES


        } while (addMore.equalsIgnoreCase("yes"));


        System.out.println(list);
    }
}
