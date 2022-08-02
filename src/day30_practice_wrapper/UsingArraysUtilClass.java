package day30_practice_wrapper;

import my_utils.ArrayUtil;

import java.util.Arrays;

public class UsingArraysUtilClass {

    public static void main(String[] args) {

        int num = ArrayUtil.min(4, 2, 1, -5, 1, -1, 2, 5, 2, -1, 5);
        System.out.println(num);
        System.out.println(ArrayUtil.min(5, 3, 4, 5, 2, 5, 8));

        System.out.println(ArrayUtil.max(5, 3, 4, 5, 2, 5, 8));

        int[]a = {45, 2, 6, 2, 6, 23, 83, 12};
        System.out.println(ArrayUtil.max(a));

        System.out.println(ArrayUtil.max(new int[]{4, 5, 2, 5, 2}));

        int[]b = {4, 5, 12, 5, 14};
        System.out.println(ArrayUtil.contains(b, 13));
        System.out.println(ArrayUtil.contains(b, 5));

    }

}
