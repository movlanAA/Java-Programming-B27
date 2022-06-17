package day06_operators;

public class RelationalTasks {
    public static void main(String[] args) {

        /*

        declare a speed variable
        speed limit is 50
        find out if you are speeding
        true/false

         */

        int currentSpeed = 60;
        int speedLimit = 50;
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Is speeding: " + isSpeeding);

        /*
        declare a number variable
        find out if the number is positive, negative or zero
         */

        int number = 10;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;
        System.out.println("isPositive = " + isPositive);
        System.out.println("isNegative = " + isNegative);
        System.out.println("isZero = " + isZero);


        /*
            define a number
            find out if it is even or odd
         */

        int num = 5;
        boolean isEven = num % 2 == 0;
        boolean isOdd = num % 2 != 0; // num % 2 == 1 // isEven != true

    }
}
