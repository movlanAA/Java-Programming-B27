package day20_loops;

public class MultipleEnd {
    /*
    Multiply End

Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times

	Ex:
		Input:
			Hello?
			3
		Output:
			Hello????

	Ex:
		Input:
			java
			5
		Output:
			javaaaaaa
     */

    public static void main(String[] args) {

        String str = "java";
        int end = 6;

        for(int i = 0; i < end; i++) {// int i = 1; i <= end
           str += str.charAt(str.length() - 1); // the character at the last index
        }
        System.out.println(str);

    }
}
