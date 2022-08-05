package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyMethod {
    public static void main(String[] args) {

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('a', 'e', 'e', 'a', 'e', 't', 'p', 'i', 'o', 'o'));
        System.out.println(Collections.frequency(letters, 'e'));
        System.out.println(Collections.frequency(letters, 'a'));
        System.out.println(Collections.frequency(letters, 'o'));
        System.out.println(Collections.frequency(letters, 'z'));
        System.out.println(Collections.frequency(letters, 'E'));

        // Given a String determine how many times the letter 'a' is in the String

        String s = "aabbbabeiffca";

        ArrayList<String> list = new ArrayList<>( Arrays.asList(s.split("")));
        /*

            s.split("") --> converts the String to a String[]
            Arrays.asList(s.split("")) --> converts the String[] to ArrayList<String>
            new ArrayList<>( Arrays.asList(s.split(""))); --> creates an ArrayList of each character as its own element


         */
        System.out.println(list);
        System.out.println(Collections.frequency(list, "a"));


    }
}
