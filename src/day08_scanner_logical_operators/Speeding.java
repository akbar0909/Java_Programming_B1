package day08_scanner_logical_operators;

public class Speeding {
    /*
    Declare three variables;
    caurrent speed
    speed limt
    speeding

    print
    is this person speeding? true  or false
     */

    public static void main(String[] args) {

        int currentSpeed = 56;
        int speedLimit = 65;
        boolean isSpeeding = currentSpeed >= speedLimit;

        boolean isSpeeding1 = currentSpeed <= speedLimit;



        System.out.println("is this person speeding?  " + isSpeeding+ "\n");

        System.out.println("is this person speeding?  " + isSpeeding1);


    }
}
