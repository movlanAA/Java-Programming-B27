package day04_variables;

public class MyName {
    /*
        declare your name as multiple char variables
        print your name, see what happens
     */
    public static void main(String[] args) {

        char first = 'S';
        char second = 'a';
        char third = 'i';
        char fourth = 'm';

        // char a = 'a', b = 'b', c = 'c';

        System.out.print(first);
        System.out.print(second);
        System.out.print(third);
        System.out.print(fourth);
        System.out.println();

        System.out.println("my name is " + first + second + third + fourth); // concatenate a String in the beginning, this will concatenate all the chars together

    }

}
