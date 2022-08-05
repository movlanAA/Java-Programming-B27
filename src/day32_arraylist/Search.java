package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("friday", "java", "summer", "reading", "coding", "java", "coding", "java", "summer"));
        System.out.println(searchInList(list, "java"));
        System.out.println(searchInList(list, "coding"));
        System.out.println(searchInList(list, "friday"));

    }

    public static int searchInList(ArrayList<String> list, String target){
        int count = 0;
        for(String each: list){
            if(each.equalsIgnoreCase(target)){
                count++;
            }
        }
        return count;
    }

}
