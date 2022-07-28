package day27_methods;

public class Parameters {

    public static void greeting(String name){ // name is the parameters, variable used in the method
        System.out.println("Hello " + name);
        System.out.println("Nice to meet you " + name);
    }

    public static void age(int birthYear){
        System.out.println("You are " + (2022 - birthYear) + " years old");
    }

    public static void main(String[] args) {

        greeting("James"); // James is an argument, value of the name for method
        greeting("Kelly"); // Kelly is an argument, value of the name for method

        age(2000);
        age(1987);

    }



}
