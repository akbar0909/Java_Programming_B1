package day18_loops;

public class Syllables {
    /*
Syllables
    Given a String separated by dashes calculate how many syllables the words are
    Ex:
    Input:
    ja-va Output:
    2
 */
    public static void main(String[] args) {
        String word = "Na-za-kat";
        int count = 0;


        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '-') {
                count++;
            }
        }

        System.out.println("The count of syllables :" + (count+1));
    }
}
