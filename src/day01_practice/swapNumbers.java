package day01_practice;

public class swapNumbers {

        public static void main(String[] args) {

            int a = 10, b = 20;

            System.out.println("Before swapping the numbers:");
            System.out.println("First number = " + a);
            System.out.println("Second number = " + b);

            int temp = a;  //Temporary value is assigned with the value of the First variable
            a = b;         //The First variable is assigned with the value of the Second variable
            b = temp;      // The Second variable is assigned with the value of the Temporary variable i.e, the First variable

            System.out.println("After swapping the numbers: ");
            System.out.println("First number = " + a);
            System.out.println("Second number = " + b);
        }
}