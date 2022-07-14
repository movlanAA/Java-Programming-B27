package day19_loops;

public class CountLetter {
    public static void main(String[] args) {
        //frequency of letter in word

        // word -> java
        // how many 'a' chars?

        String word = "java";
        int count = 0;

        for(int i = 0; i < word.length(); i++){  // i <= word.length() - 1
            if(word.charAt(i) == 'a'){
                count++;
            }
        }

        System.out.println(count);



    }
}
