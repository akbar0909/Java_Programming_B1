package day05_variable;

public class CellPhone {
    public static void main(String[] args) {
        /*
        create a class CellPhone

        create a main method
        declare and assign these variables:
            brand, model, color, price, storage, hasCamera, sim(char A, B, C)
        Print all the variables
            sample data: apple, iphone 10, black, 1000.99, 128, true, A
     */


        String brand = "Apple";
        String model = "iphone 10";
        String color = " Black";
        double  price = 1000.99;
        int  storage = 128;
        boolean hasCamera = true;
        char  sim = 'A';

        System.out.println("I have an " + model + " from  " + brand);
        System.out.println("it came in the color "+ color+ " and it has " + storage + " GB");
        System.out.println(" for thIs sim type "+ sim  +  " with camera " + hasCamera + " total price was $ " + price);

        // approach 2 with String variable:String fullMessage = "I have an " + model + " \nfrom  " + brand + "\nit came in the color "+ color+ " \nand it has "
        //                + storage + "\nGB";

        System.out.println();
        String fullMessage = "I have an " + model + " from  " + brand + "\nit came in the color "+ color+ " \nand it has "
                + storage + "GB" + "\nfor this sim type " + sim  +  " with camera " + hasCamera + " total price was $ " + price;


        System.out.println(fullMessage);
    }


    }



