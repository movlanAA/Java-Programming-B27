package day02_print_statements;

public class EscapeExample {
    public static void main(String[] args) {

//        System.out.println("Today is "Friday""); this is not valid because it thinks the double quotation is for java syntax, but we want to print the character of double quotation

        System.out.println(" \" here \"  ");

        System.out.println("Today is \"Friday\"");

        // I want to print a \
        System.out.println("\\"); // first \ is syntax, the second \ is the character we want to print

        // tabbing here
        System.out.println("\tHello");
        System.out.println("\t\tHello");

        // next line
        System.out.println("Shopping List:\n1)Juice\n2)Chips\n3)Water");

        System.out.println();

        System.out.println("Shopping List:\n\t1)Juice\n\t2)Chips\n\t3)Water");

    }
}
