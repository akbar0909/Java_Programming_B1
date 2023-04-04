package day21_arrays;

public class AddElement {
    public static void main(String[] args) {
        /*
        all String types
        0 -> id
        1 -> first name
        2 -> last name
        3 -> batch number
     */
        int [] nums = {3, 6, 10};   // nums.length --- > number of elements --->  3
        System.out.println("Total: " + (nums[0] + nums[1] + nums[2]) );


        System.out.println("-----------------------");
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        System.out.println("Toatal: " + total);



    }
}
