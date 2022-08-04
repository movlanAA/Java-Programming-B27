package day31_arraylist;

import java.util.ArrayList;

public class RemovingMethod {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("today");
        words.add("raining");
        words.add("java");
        words.add("flying");
        System.out.println(words);

        // removing by index

        words.remove(2); // returns the element that you remove
        System.out.println(words);

        System.out.println(words.remove(0));
        System.out.println(words);

        words.clear(); // emptys the whole ArrayList
        System.out.println(words);

        // use the removing by object

        words.add("jumping");
        words.add("barn");
        words.add("chicken");
        words.add("cow");
        System.out.println(words);

        words.remove("barn");
        System.out.println(words);

        System.out.println(words.remove("Cow"));
        System.out.println(words);

        System.out.println(words.remove("chicken"));
        System.out.println(words);


    }
}

/*

    String s = "hello"

    s.charAt(0)

    System.out.println(s.charAt(0))

 */