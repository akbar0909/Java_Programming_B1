package day17_loops;

public class NultiplicationTasks {
    public static void main(String[] args) {
          /*

    Task:
        declare and assign a number

        print all the multiplication results for 1 through 10

        Ex:
            4

            4 x 1 = 4
            4 x 2 = 8
            ..
            4 x 10 = 40

 */
        int num = 3;

        for (int i = 0; i <= 10; i++) {

            System.out.println(num + " * " + i + " = " + (num * i));    // 3 * 0 = 0
            // 3 * 1 = 1
        }
    }
}
