package day01_practice;

public class Fibonacci {

    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 21
        int a = 0;
        int b = 1;
        int n = 15;

        for (int i = 0; i <= n; i++) {
            System.out.println(a + "");

            int c = b + a;
            a = b;
            b = c;

        }
    }
}



