package day16_loops;

public class ExtraTask {
    public static void main(String[] args) {
        int n = 4;
        String word2 = "";

        String word = "Java";
        while (word2.equals(word)){
            if (n < 4){
                word2 += word.charAt(n);
                n++;
                System.out.println(word2);
            }
        }

        int num2  = 0;
        while(word2.contains("a")) {
            System.out.println(num2);
            num2++;
            if(num2 == 4) {
                word2 = word2.replace("a", "o");
            }
        }
        System.out.println(word);
    }
}
