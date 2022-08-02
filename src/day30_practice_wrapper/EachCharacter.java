package day30_practice_wrapper;

public class EachCharacter {
    /*
        task: given a String, separate each type of character

     */
    public static void main(String[] args) {

        String s = "49jaVA$33*&EOWe82";
        String upper = "", lower = "", number = "", special = "";

        for(int i = 0; i < s.length(); i++){

            char letter = s.charAt(i);

            if(Character.isUpperCase(letter)){
                upper += letter;
            } else if(Character.isLowerCase(letter)){
                lower += letter;
            } else if(Character.isDigit(letter)){
                number += letter;
            } else {
                special += letter;
            }

        }

        System.out.println("uppercase: " + upper);
        System.out.println("lowercase: " + lower);
        System.out.println("numbers: " + number);
        System.out.println("special characters: " + special);




    }
}
