package day19_nested_loops;

public class NestLoopExample2 {
    public static void main(String[] args) {

         for ( int i = 1;i <= 3; i++){                           // 1                // 2                    // 3


            if (i == 1) {                                       // 1 == 1           // 2 == 1               // 3 == 1
                System.out.println("Color is Red");             // Color is Red
            }

            if (i == 2) {                                       // 1 == 2           // 2 == 2               // 3 == 2
                System.out.println("Color is Black");                               // Color is Black
            }

            if (i == 3) {                                       // 1 == 3           // 2 == 3               // 3 == 3
                System.out.println("Color is Blue");                                                        // Color is Blue
            }

        }


        System.out.println("--------------------------");


        for (int i = 0; i < 5; i++) {
            System.out.println("A" + i);


        }
    }
}
