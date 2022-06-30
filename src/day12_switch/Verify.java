package day12_switch;

import java.util.Scanner;

public class Verify {
    /*
    declare and assign two expected numbers:
	pincode: 1234
	ssn: 1111

ask the user to enter the two numbers and compare them with the system values defined above. If they match print Authentication successful

if they don't match print all the reasons that authentication failed:

	if the pincode was incorrect print: Pin Code is incorrect
	if the ssn was incorrect print: Last 4 SSN numbers are incorrect
     */
    public static void main(String[] args) {

        int systemPin = 1234;
        int systemSsn = 1111;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your pincode:");
        int inputPin = input.nextInt();
        System.out.print("Please enter your last 4 digits of ssn:");
        int inputSsn = input.nextInt();

        if(systemPin == inputPin && systemSsn == inputSsn){
            System.out.println("Authentication successful");
        } else {

            if(systemPin != inputPin){
                System.out.println("Pin Code is incorrect");
            }

            if(systemSsn != inputSsn){
                System.out.println("Last 4 SSN numbers are incorrect");
            }

        }





    }
}
