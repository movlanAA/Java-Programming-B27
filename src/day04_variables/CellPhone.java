package day04_variables;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "Apple";
        String model = "IPhone X";
        String color = "Rose Gold";
        double price = 1000.99;
        boolean hasCamera = true;
        int size = 128;
        char sim = 'A';

        System.out.println("\tPhone information:\nBrand: " + brand);
        System.out.println(model + " in " + color);
        System.out.println("With " + size + "gb the price is $" + price);
        System.out.println("sim type: " + sim + " and has a camera: " + hasCamera);

        // alternative solution:

        String report = "\tPhone information:\nBrand: " + brand +
                "\n" + model + " in " + color +
                "\nWith " + size + "gb the price is $" + price +
                "\nsim type: " + sim + " and has a camera: " + hasCamera;

        System.out.println(report);


    }
}
