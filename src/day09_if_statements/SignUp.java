package day09_if_statements;

import java.util.Scanner;

public class SignUp {
    /*
        signing up to join newsletter
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        System.out.println("Enter your email");
        String email = input.next();
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Do you want to sign up for the extra newsletter T/F");
        boolean extra = input.nextBoolean();
        System.out.println("How did you hear about us");
        input.nextLine(); // take the enter from the nextBoolean input
        String hearAboutUs = input.nextLine();

        String confirm = fullName + " you signed up! with email: " + email + ". We are glad to get readers at age: " + age + ". You signed up for extra newsletter: " + extra + ". Credit goes to " + hearAboutUs;
        System.out.println(confirm);


    }
}
