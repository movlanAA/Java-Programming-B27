package day08_scanner;

import java.util.Scanner;

public class PersonInfo {
    /*
        ask for first name
        ask for last name
        ask for address
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = input.next();
        System.out.println("Please enter your last name");
        String lastName = input.next();

        input.nextLine(); // for the enter input

        System.out.println("Please enter your address");
        String address = input.nextLine();

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(address);

    }
}
