package day10_a_if_statetments;

import java.time.Month;

public class DaysInMonth {
    /*

    create a int variable to represent the month number, where 1 is January and 12 is December.
    use the month number input to determine how many days are in that month.
    use the following data to help you determine the number of days in each month:

    Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
    Months that has 30 days: 4, 6, 9, 11
    Month that has 28 days: 2

            */
    public static void main(String[] args) {


        // 12 months in a year.
        // 1 - Jan
        // 2 - Feb ......
        // 12 - Dec

        int monthNUmber = 13;

//        Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
//        Months that has 30 days: 4, 6, 9, 11
//        Month that has 28 days: 2

        boolean has31Days = monthNUmber == 1 || monthNUmber == 3 || monthNUmber == 5 || monthNUmber == 7 || monthNUmber == 8 || monthNUmber == 10 || monthNUmber == 12;

        boolean has30Days = monthNUmber == 4 || monthNUmber == 6 || monthNUmber == 9 || monthNUmber == 11;

        boolean has28Days = monthNUmber == 2;

        if (has31Days) {
            System.out.println("This month has 31 days");
        }


        if (has30Days) {
            System.out.println("This month has 30 days");
        }

        if (has28Days) {
            System.out.println("This month has 28 days");
        } else {
            System.out.println("enter a number 1-12");
            System.out.println("wake up");
            System.out.println("not found");
            System.out.println("we have only 12 months");
        }


    }
}
