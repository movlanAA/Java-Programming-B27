package day01_practice;

public class InterviewMentor {
    //public static void main(String[] args) { //short is psvm
        /**
         * 4. String -- sum of digits in a string
         * * Write a method that can return the sum of the digits in a string
         */

        public static void sumDigitsInString (String str){
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    int number1 = Integer.parseInt(String.valueOf(str.charAt(i)));
                    sum += number1;
                }

            }
            System.out.println(sum);
        }

        public static boolean verifyPasswordIsValid(String str) {
            int UpperCase = 0;
            int LowerCase = 0;
            int SpecialChar = 0;
            int digit = 0;

            if (str.length() < 6 || str.contains(" ")) {
                return false;
            }

            for (int i = 0; i < str.length(); i++) { //Donjeta123
                if (Character.isUpperCase(str.charAt(i))) {
                    UpperCase++;
                } else if (Character.isDigit(str.charAt(i))) {
                    digit++;
                } else if (Character.isLowerCase(str.charAt(i))) {
                    LowerCase++;
                }else if (Character.isSpaceChar(str.charAt(i))) {
                    SpecialChar++;
                }
            }

            if (UpperCase < 1 && LowerCase < 1 && SpecialChar < 1 && digit < 1) {
                return false;
            } else {

            }
            return true;
        }
       // Nazerke Omar — Today at 2:23 PM
        public static boolean validPassword(String str){
            if(str.length() < 6 || str.contains(" ")){
                return false;
            }
            boolean hasDigit = false;
            boolean hasLetter = false;
            boolean hasLowerCase = false;
            boolean hasSpacialChar = false;

            for (int i = 0; i < str.length(); i++) {
                if(Character.isDigit(str.charAt(i)) && !hasDigit){
                    hasDigit = true;
                } else if(Character.isUpperCase(str.charAt(i)) && !hasLetter){
                    hasLetter = true;
                }else if(Character.isLowerCase(str.charAt(i)) && !hasLowerCase){
                    hasLowerCase = true;
                }else if("!@#$%^&*()_+".contains(str.charAt(i) + "")){
                    hasSpacialChar = true;
                }
            }
            return (hasDigit && hasLetter && hasLowerCase && hasSpacialChar);
        }
        public static int sumOfDigits(String str){
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                if(Character.isDigit(str.charAt(i))){
                    sum += Character.getNumericValue(str.charAt(i));
                }
            }
            return sum;
        }
    }

