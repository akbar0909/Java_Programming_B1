package day30_custom_classes_b;

public class App {

    String name;
    double version;
    boolean isFree;

    public void run() {
        System.out.println(name + " is running");
    }

    public void update () {
        System.out.println(name + " is updated");
        version += 0.1;
    }

}
