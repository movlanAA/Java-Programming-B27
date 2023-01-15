package day01_practice;

import java.util.Arrays;

public class ReversePractice {
    public static void main(String[] args) {


//        int [] arr ={1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(arr));
//        int [] revers =new int[arr.length];
//        int j = 0;
//        for (int i = arr.length-1; i >= 0 ; i--,j++) {
//
//            revers[j]=arr[i];
//        }
//        System.out.println(Arrays.toString(revers));



    int [] arr={3,4,5,6};
        System.out.println(Arrays.toString(arr));
        int [] reverse=new int[arr.length];
        int x=0;
        for (int i=arr.length-1;i>=0;i--,x++){
            reverse[x]=arr[i];
        }
        System.out.println(Arrays.toString(reverse));



    }
}
