package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveNums {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 5, 2, 3, 5, 2, 1, 5, 1, 8, 9, 7, 4, 10, 0, 2, 3));

        // remove all the numbers that are less than 5

        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) < 5){
                nums.remove(i);
                i--; // if I removed an element, the elements will move over which means their index will change, I subtract 1 to make sure I don't skip any elements
            }
        }

        System.out.println(nums);

        // -------------------------------------------------------------------

        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1, 5, 2, 3, 5, 2, 1, 5, 1, 8, 9, 7, 4, 10, 0, 2, 3));
        // remove all the numbers that are less than 5 - using removeIf
        nums2.removeIf( n -> n < 5 ); // n will be every element
        System.out.println(nums2);

    }
}
