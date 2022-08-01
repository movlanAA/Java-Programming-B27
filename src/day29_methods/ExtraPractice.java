package day29_methods;

public class ExtraPractice {

    public static void main(String[] args) {
        int[] nums = {1, 24, 5, 12};
        System.out.println(sumFromArray(nums));
    }

    /*
    Create a method that accept an int array. Take the sum of all the numbers and return the sum
     */
    public static int sumFromArray(int[] nums){
        int sum = 0;
        for(int eachNum: nums){
            sum += eachNum;
        }
        return sum;
    }



}
