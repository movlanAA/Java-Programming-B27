package day01_practice;

public class Practice {
    //public static void main(String[] args) {
       /* public static int divide(int a, int b) {

            int count = 0;

            for (int i = b; i <= a; i += b){
                count++;
            }
            return count;

        */



       /* public static void withoutDivision ( int x, int y){
            int result = 0;
            while (x >= y) { // 5 > 5
                x = x - y; // 10 and 5   10 - 5  = 5, 5 - 5 = 0
                result++;
            }

            System.out.println(result);
  */


    public static void main(String[] args) {

        int number = 15;
        String result = "";

        if(number%3==0 && number%5==0){
            result = "FINRA";
        } else if(number%5==0){
            result = "RA";
        }else if(number%3 ==0){
            result = "FIN";
        }else{
            result =   ""+number; // "15"
        }

        System.out.println("result = " + result);

    }

}



