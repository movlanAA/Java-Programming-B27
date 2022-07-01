package day13_switch_string;

public class StringEquals {
    public static void main(String[] args) {

        String s = "java";
        String s2 = "java";
        // both of these are String literal, so they are both in the String pool

        System.out.println("s == s2 " + (s == s2)); // checks if they are the same object, the same location, BUT it does not check the value
        System.out.println("s.equals(s2) " + s.equals(s2)); // checks if the value of the Strings is the same

        String s3 = new String("java"); // in the heap
        System.out.println("s == s3 " + (s == s3)); // comparing two different objects
        System.out.println("s.equals(s3) " + s.equals(s3)); // checks if the value(character) of the Strings are the same

        System.out.println(s.equals("Java"));

    }
}
