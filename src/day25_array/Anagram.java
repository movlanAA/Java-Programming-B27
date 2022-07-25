package day25_array;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        /*
        [IQ] Given two Strings determine if they are anagram or not. Anagram is when the character of the words can be reordered to get a different word
        Ex:
          listen
          silent

The letters of the two words are the same so they are anagram
         */

        String word1 = "listen";
        String word2 = "silent";

        char[] first = word1.toCharArray();
        char[] second = word2.toCharArray();
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        Arrays.sort(first);
        Arrays.sort(second);

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        if(Arrays.equals(first, second)){
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        System.out.println(Arrays.equals(first, second) ? "Anagram" : "Not Anagram");

    }
}
