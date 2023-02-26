package day16_loops;

public class MethodChaining {
    public static void main(String[] args) {
      /*  18.a - .replace(char1, char2);        -it will take the given char1 and and replace all of them with char2 in a String
        18.b - .replace(Str1, Str2);        -it will take the given Str1 and and replace all of them with Str2 in a String


        19. - .replaceFirst(Str1, Str2);    -it will take the given Str1 and and replace first occurrence of Str1 with Str2 in a String
                NEW
-If we use String methods and it RETURNs a String, we can continue CHAINING by using another method.
                    We can do this as long as method RETURNS a String.
       */
        String word = "     Java is a great language       ";
        System.out.println(word);

        word = word.trim();     // "Java is a great language"
        //  0123456.........
        System.out.println(word);


//        word = word.substring(0, 4);
        word = word.substring(0, word.indexOf(" "));
        System.out.println(word);


        System.out.println("--------------------------");
        word = "     Java is a great language       ";
        System.out.println(word);

        //TODO:Debug
        //String word2 = word.trim().substring(0, 4).toLowerCase().toUpperCase().contains("ja");  // not valid
        //String word3 = contains("ja").word.trim().substring(0, 4).toLowerCase().toUpperCase();  // Not valid
        String word4 = word.indexOf(1) + "Hello";  // Concatenation
//        String word5 = word.indexOf(1).substring(0, 4);  // chaining
        String word6 = word.trim().substring(0, 4).toLowerCase().toUpperCase();

        System.out.println(word6);
    }
}
