package day24_array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {

        /*
        Move Zeros

	Write a program that will move all the zero numbers to the end of the array. The rest of the numbers will move over in position

Hint: You don’t have to manipulate the given array, try to use another array too. Think about the indexes

	Ex:
	Input:
		[10, 0, 5, 0, 1, 0]
	Output:
		[10, 5, 1, 0, 0, 0]
         */

        int[] nums = {10, 0, 5, 0, 1, 0};
        int[] fixed = new int[nums.length]; // [ 10, 5 , 1 , 0, 0, 0 ]
        int indexToRead = 0; // read every element from beginning to end  --> same as i in a traditional loop
        int indexToStore = 0; // store values into the fixed array, maybe will not increment each time

        // indexToRead  : 6
        // indexToStore : 3

        while(indexToRead < nums.length){

            if(nums[indexToRead] != 0){
                fixed[indexToStore] = nums[indexToRead];
                indexToStore++;
            }

            indexToRead++;
        }
        System.out.println(Arrays.toString(fixed));


    }
}
