package my_utils;

public class ArrayUtil {
    /*
        Group of utility methods for arrays
        Extra practices from 08/01 will be done here
     */

    /*
    Min Number
        create a method that will accept an int array and return the smallest number from the array
    */

    public static int min(int ... arr){ // int [] arr IS THE SAME AS int ... arr
        int min = arr[0];

        for(int each : arr){
            if(each < min){
                min = each;
            }
        }
        return min;
    }

    /*
    Max Number
        create a method that will accept an int array and return the biggest number from the array
     */
    public static int max(int ... arr){
        int max = arr[0];

        for(int each : arr){
            if(each > max){
                max = each;
            }
        }
        return max;
    }

    /*
    Contains
        create a method that will accept an int array and an int number. Check and return if the given number is in the array.
     */

    public static boolean contains(int [] arr, int num){

        for(int each : arr){
            if(each == num){
                return true;
            }
        }

        return false;
    }



}
