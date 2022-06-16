package day05_arithmetic_operators;

public class MathPractice {

    public static void main(String[] args) {

        System.out.println(4 + 5);
        System.out.println(4 * 5);

        // int * int --> int
        System.out.println(2 * 5);

        // int * double --> double
        System.out.println(2 * 5.5);

        // int / int -> int
        System.out.println(10 / 3);

        // int / double --> double
        System.out.println(10 / 3.0);

        System.out.println(5 % 2);// 2 + 2 -> 2 went into 5 twice, there is one left over

        System.out.println(4 % 2); // no left over because 2 divides into 4 evenly

        System.out.println(6 % 2); // 6/2 -> that is evenly divisible, so not left over

        System.out.println(4 % 10); // 4 /10, not enough to have a whole 10, 4 is the left over


    }
}
