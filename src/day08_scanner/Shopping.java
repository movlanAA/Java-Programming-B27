package day08_scanner;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the item name");
//        String item = "Water";
        String item = input.nextLine();
        System.out.println("What is the item price");
//        double price = 3.99;
        double price = input.nextDouble();
        System.out.println("How many " + item + " do you want");
//        int quantity = 5;
        int quantity = input.nextInt();

        String order = "Your total for " + quantity + " " + item + " is " + quantity * price;
        System.out.println(order);


    }
}
