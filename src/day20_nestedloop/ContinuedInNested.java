package day20_nestedloop;

public class ContinuedInNested {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {

            System.out.println("i: " + i);



            for (int j = 0; j < 3 ; j++) {

                if (j == 2) {
                    continue;
                }


                System.out.println("j " + j);

            } // INNER LOOP ends




        } //OUTER LOOP ends
    }
}
