package day07_relational_operator;

public class AdeGroup {

    /*
declare and assign ade variable
is person a kid (up to 13, include 13)
is the person a senior citizen ( 65 and above)

 */
    public static void main(String[] args) {

        int age =13;

        boolean isKid = age <= 13;
        boolean isSenior = age>=65;

        System.out.println(" you are a kid: " + isKid );
        System.out.println( " you are a senior " + isSenior);

    }
}

