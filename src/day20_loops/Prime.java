package day20_loops;

public class Prime {
    /*
    [IQ] Prime number

        Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.

        Ex:
            Input:
                11

            Output:
                prime


        Ex:
            Input:
                10

            Output:
                not prime
     */
    public static void main(String[] args) {

        int n = 12;
        boolean isPrime = true;

        for(int i = 2; i < n; i++){

            if(n % i == 0){
                isPrime = false;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");

    }
}

/*
 if(n % i == 0){
       11 % 2
       11 % 3
       11 % 4

 */
