package day05_arithmetic_operators;

public class UpdateVariable {
    public static void main(String[] args) {

        int a = 4;
        System.out.println(a + 10);
        System.out.println(a);

        a = a + 20;
        System.out.println(a);

        int b = 5;
        b += 30; // this is the same as this: b = b + 30;
        System.out.println(b);

    }
}
