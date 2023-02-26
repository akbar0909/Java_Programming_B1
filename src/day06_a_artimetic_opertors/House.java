package day06_a_artimetic_opertors;

public class House {
    public static void main(String[] args) {
       /*
    Create a class House
    create a main method
    - Each the datatype you feel is most appropriate for each variable.
    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),
    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
     */


            String houseType = "PentHouse";
            int numberOfBedroom = 5;
            int numberOfBathroom = 5;
            int numberOfKitchens = 2;
            boolean hasBasement = false;
            boolean hasAttic = false;
            boolean hasPool =true;
            boolean  isOnSale = false;
            boolean hasPark = true;
            double costOfHouse = 1_000_000.99;
            String address = "1111 fairfax";
            int zipcode =  22030;
            double  schoolRating = 5;




       /*     String houseInfo = "The " + houseType+ "on" + address + "," +zipcode+ " costs $" + costOfHouse+ "\nThe  "  + houseType+
                    "has " + numberOfBedroom + "  bedrooms, " + numberOfBathroom  + " bathrooms, "  + numberOfKitchens + "kitchen \nIt " +
                    "also includes a basement: " +  hasBasement  + " has an attic: "  + hasAttic + " has a pool: " + hasPool +
                    "iS on sale: " + isOnSale + " has a park: " + hasPark +
                    ". The school in the area have a rating of " + schoolRating;

            System.out.println ( houseInfo);

        */
            System.out.println( "The " + houseType+ "on" + address + "," +zipcode+ " costs $" + costOfHouse+ "\nThe  "  + houseType+
                    "has " + numberOfBedroom + "  bedrooms, " + numberOfBathroom  + " bathrooms, "  + numberOfKitchens + "kitchen \nIt " +
                    "also includes a basement: " +  hasBasement  + " has an attic: "  + hasAttic + " has a pool: " + hasPool +
                    "iS on sale: " + isOnSale + " has a park: " + hasPark +
                    ". The school in the area have a rating of " + schoolRating);



    }

}
