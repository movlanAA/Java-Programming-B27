package day41_exceptions.hiding;

public class Run {
    public static void main(String[] args) {

        First.staticMethod(); // accesses the method in the First class
        Second.staticMethod(); // accesses the method in the Second class

        System.out.println();

        new First().instanceMethodA(); // calls the instance method, which is calling the static method inside. The closest method (same class) method is called
//        new First().instanceMethodB(); instance method b was created in the sub class
        new Second().instanceMethodA(); // this instance method was inherited, it calls the closest static method (the one in the First class)
        new Second().instanceMethodB(); // this instance method is also calling the static method, the closest one is the one in the second class
    }
}
