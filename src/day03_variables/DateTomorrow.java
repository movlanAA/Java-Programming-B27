package day03_variables;

public class DateTomorrow {
    public static void main(String[] args) {

        /*
            declare and assign 3 variables(numbers)
            month, day, year

            print the date in this format:
                Date: month \ day \ year

            also update the day for tomorrow date
            print tomorrow's date in this format:
               Tomorrow's Date: month \ day \ year

         */

        int month, day, year; // made 3 variables, all of them are int type
        month = 6;
        day = 13;
        year = 2022;

        //  alternative declaration and assignment: int month = 6, day = 13, year = 2022;

        System.out.println("Date: " + month + " \\ " + day + " \\ " + year);

        // Show date for tomorrow
        day = 14;
        System.out.println("Tomorrow's Date: " + month + " \\ " + day + " \\ " + year);

    }
}
