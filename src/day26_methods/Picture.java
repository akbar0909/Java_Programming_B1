package day26_methods;

public class Picture {

    // How about if I have same methodname with either different parameter amount

    public static void main(String[] args) {

    }

    public static void draw() {
        System.out.println("Trying to draw");

    }

    public static void draw(String color) {  // a parametersize method  - overladed method
        System.out.println(" Drawing with the " + color);


    }

    public static void draw(String color, String color2) {
        System.out.println(" Drawing with the " + color + "and" + color2);
    }
//    public static void draw( int length) {
//       System.out.println("Drawing in this size: " + length);

    public static void draw(String str, int size) {
        System.out.println("Just  drawing");


    }
}

