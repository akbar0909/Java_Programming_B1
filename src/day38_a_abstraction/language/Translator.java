package day38_a_abstraction.language;

public class Translator {
    public static void main(String[] args) {
        //Language lng = new Language();
        // We cant do this because interface canNOT be instantiated


        Turkish tr = new Turkish();
        tr.hi();
        tr.bye();
    }
}
