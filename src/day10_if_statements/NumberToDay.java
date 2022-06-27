package day10_if_statements;

public class NumberToDay {
    /*
    create a number to represent the day. (1 being Monday and 7 being Sunday)
Print the day related to the number

	Ex:
		2
		Tuesday

	Ex:
		5
		Friday
     */
    public static void main(String[] args) {

        int number = 4;

        if (number == 1) {
            System.out.println("Day is Monday");
        } else if (number == 2) {
            System.out.println("Day is Tuesday");
        } else if (number == 3) {
            System.out.println("Day is Wednesday");
        } else if (number == 4) {
            System.out.println("Day is Thursday");
        } else if (number == 5) {
            System.out.println("Day is Friday");
        } else if (number == 6) {
            System.out.println("Day is Saturday");
        } else if (number == 7) {
            System.out.println("Day is Sunday");
        } else {
            System.out.println(number + " is not valid day number");
        }

        // Q: if the number is 4 what day is it and how many conditions are checked


    }
}


/*
        if(number == 1){
            System.out.println("Its Monday");
        }

        if(number == 2){
            System.out.println("Tuesday");
        }

        if(number == 3){
            System.out.println("Wednesday");
        }
 */