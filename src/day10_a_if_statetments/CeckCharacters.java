package day10_a_if_statetments;

public class CeckCharacters {

    /*
    create a char variable with a letter
    find out if the letter is an upper case letter or lowercase letter

    Ex:

        'b'
        print out: lowercase

        'A'
        print out: Uppercase

 */
    public static void main(String[] args) {


        char letter = 'a';

//        if(letter >= 97 && letter <= 122){
//            System.out.println("lowercase");
//        }

        if(letter >= 'a' && letter <= 'z'){
            System.out.println("Lowercase");
        }

        if(letter >= 'A' && letter <= 'Z'){
            System.out.println("Uppercase");}


    }
}
