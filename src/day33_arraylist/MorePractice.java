package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class MorePractice {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Mutasem", "Baz", "Anam", "Tina", "Manizha", "Busra", "Reem", "Farzona", "Marjan"));

        ArrayList<String> byLength = new ArrayList<>(names);
        byLength.removeIf( name -> name.length() > 5);
        System.out.println(byLength);

        ArrayList<String> byFirstLetter = new ArrayList<>(names);
        byFirstLetter.removeIf( p -> p.startsWith("M") || p.startsWith("B"));
        System.out.println(byFirstLetter);

        ArrayList<String> byLastLetter = new ArrayList<>(names);
        byLastLetter.removeIf(str -> !str.endsWith("a"));
        System.out.println(byLastLetter);


    }
}
