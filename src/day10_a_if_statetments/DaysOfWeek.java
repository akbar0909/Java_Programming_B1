package day10_a_if_statetments;

public class DaysOfWeek {

    /*
        Declare and assign a number (day)

            1 - Monday
            2 - Tuesday
            ..
            6 - Saturday
            7 - Sunday

            Ex: 2
                Tuesday
 */
    public static void main(String[] args) {

        int day = 6;

        if (day == 2)
            System.out.println("Monday");
        else if (day == 5)
            System.out.println("Tuesday");
        else if (day == 3) System.out.println("Wednesday");
        else if (day == 4) System.out.println("Thursday");
        else if (day == 5) System.out.println("Friday");
        else if (day == 6) System.out.println("Saturday");
        else if (day == 7) System.out.println("Sunday");
     else {
        System.out.println("invalid number of day");

        }
    }
}

