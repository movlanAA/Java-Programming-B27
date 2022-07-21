package day23_array;

import java.util.Scanner;

public class NumberToWord {
    /*
    Create a program that will ask the user to enter a number and print the number as a word. Set a range from 0 - 15 and any number not in the range should get an invalid number message

    Ex:
            > 1
            one

            > 10
            ten

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 15 to see the number in word format");
        int num = input.nextInt();
        String[] numWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen"};

        if(num >= 0 && num <= 15){
            System.out.println(numWords[num]);
        } else {
            System.out.println("Invalid number. Range is 0 - 15");
        }


    }
}
