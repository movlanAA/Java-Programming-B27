package day36_custom_classes.food;

import java.util.Arrays;

public class Kitchen {
    public static void main(String[] args) {

        /*
        Create a separate class to create and test the Food objects

    	try making an array of Food objects
    	find all the Food objects that start with 'a' and print the whole information
    	find all the Food objects that have a total price over 20 and print the name of the food
         */

        Food[] allFood = new Food[5];
        System.out.println(Arrays.toString(allFood));
        Food apples = new Food("Apples");
        allFood[0] = apples; // storing the Food object, apples, into the Food array
        allFood[1] = new Food("Sushi", 10);
        allFood[2] = new Food("Cajun Pasta", 2, 3.99);
        allFood[3] = new Food("Kebab", 5, 2.5);
        allFood[4] = new Food("Plov", 4, 2.99);
        System.out.println(Arrays.toString(allFood));

        // print each Food object in a separate line
        System.out.println();

        for(Food each: allFood){
            System.out.println(each);
        }

        // find all the Food objects that start with 'a', or 'c and print the whole information
        System.out.println("Food that starts with A or C");

        for(Food each: allFood){
            if(each.name.startsWith("A") || each.name.startsWith("C")){
                System.out.println(each);
            }
        }

    }
}
