package day07_scanner;

import java.util.Scanner;

public class FirstScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // how to make a Scanner variable/object
        System.out.println("Please enter a number");
        int number = input.nextInt();
        System.out.println("This is your number: " + number);



    }
}
