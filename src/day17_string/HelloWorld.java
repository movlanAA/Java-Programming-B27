package day17_string;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        // infinite loop, doesn't stop
//        while(true){
//            System.out.println("Hello World");
//        }

        System.out.println();
        // print 50 times
        int counter = 1; // 0 loop counter < 50

        while(counter <= 50){
            System.out.println("Hello World " + counter);
            counter++; // this line adds 1 to the number each iteration, it allows the loop to stop at some point
        }


    }
}
