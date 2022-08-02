package day30_practice_wrapper;

import my_utils.ArrayUtil;

public class UsingArraysUtilClass {

    public static void main(String[] args) {

        int num = ArrayUtil.min(4, 2, 1, -5, 1, -1, 2, 5, 2, -1, 5);
        System.out.println(num);
        System.out.println(ArrayUtil.min(5, 3, 4, 5, 2, 5, 8));

        System.out.println(ArrayUtil.max(5, 3, 4, 5, 2, 5, 8));

    }

}
