package day09_if_statements;

public class Divisibility {

    public static void main(String[] args) {

        int n = 7;

        if(n % 2 == 0){
            System.out.println(n + " is divisible by 2");
        }

        if(n % 3 == 0){
            System.out.println(n + " is divisible by 3");
        }

        if(n % 5 == 0){
            System.out.println(n + " is divisible by 5");
        }


    }
}
