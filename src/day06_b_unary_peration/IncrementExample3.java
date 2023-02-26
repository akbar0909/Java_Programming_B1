package day06_b_unary_peration;

public class IncrementExample3 {
    public static void main(String[] args) {
        int i =5;
        int z = i++;
        System.out.println(i);
        System.out.println(z); // z=5;  i = i + i;--> =6;



        int a = 10;
        int b = a + 1;
        System.out.println(a);
        System.out.println(b);

        int c =++a;
        System.out.println(c);

        int d = a++;
        System.out.println(d);
        System.out.println(a);

    }
}
