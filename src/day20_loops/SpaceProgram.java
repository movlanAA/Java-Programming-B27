package day20_loops;

public class SpaceProgram {
    /*
    Space program

    Given a String return a version of with spaces between all of the letters.
    If there is already a space in the String put an underscore

        Ex: java	-> j a v a
            space 	-> s p a c e
            more words -> m o r e _ w o r d s
     */

    public static void main(String[] args) {

        String s = "hello world";
        String result = "";

        for(int i = 0; i < s.length(); i++) {  // i <= s.length() -1
            char letter = s.charAt(i);

            if(letter == ' '){
                result += "_ ";
            } else {
                result += letter + " ";
            }
        }

        System.out.println(result.trim());

        /*

            String result = "";// h e

            hello world
            int i = 0
            charAt(i) -> charAt(0) -> h

            if(letter == ' ') h == ' ' -> false
            else -> "" + h + " "
            i++

            int i = 1
            charAt(i) -> charAt(1) -> e

            if(letter == ' ') e == ' ' -> false
            else -> "h " + e + " "
            i++
         */


    }
}
