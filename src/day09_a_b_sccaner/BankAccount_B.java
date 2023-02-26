package day09_a_b_sccaner;

import java.util.Scanner;

public class BankAccount_B {
    /*
    Task: Hard code -> Dynamic

    Create a double value for the account balance. // 100
    Create a double value for how much you want to withdraw // 500

    Check the balance after the withdrawal
        if you tried to withdraw more money that you had in the account add a negative overdraft fee to the balance: -100

    In both cases print the remaining balance after withdrawing, with overdraft free applied if you went over

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your balance");
        double balance = input.nextDouble();
        System.out.print("How much are you withdrawing");
        double withdraw = input.nextDouble();

// withdraw some amount of money from my balance
       // balance -= withdraw;
        balance = balance - withdraw;

       if (balance<withdraw){
           System.out.println("you cant withdraw because balance can not be less than zero");
       } else {
           System.out.println( "your new balance is " + balance);
       }
       // System.out.println();
       //System.out.println("New Balance " + balance);

    }

    }
