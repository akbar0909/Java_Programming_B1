package day06_b_unary_peration;

public class IncrementExample2 {
    public static void main(String[] args) {
        int age = 20;
        System.out.println(age); // 20
        System.out.println(age++); // 20
        System.out.println(age); // 21

        System.out.println(age++); // 21
        System.out.println(age); // 22

        System.out.println(++age); // 23
    }
}
