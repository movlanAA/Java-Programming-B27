package day24_array;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {

        int [] nums = {32, 5, -9, 3, 1, 20};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        // max & min
        System.out.println("Min: " + nums[0]);
        System.out.println("Max: " + nums[nums.length -1]);

        String [] strs = {"Hello", "world", "4four", "abc", "#Zebra", "apple", "1aaaaa"};
        System.out.println(Arrays.toString(strs));
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {1, 2, 4};
        int[] d = {3, 2, 1};

        System.out.println(Arrays.equals(a, b));
        System.out.println(Arrays.equals(a, c));
        System.out.println(Arrays.equals(a, d));
        Arrays.sort(d);
        System.out.println(Arrays.equals(a, d));

    }
}
