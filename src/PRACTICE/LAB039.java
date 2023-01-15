package PRACTICE;

public class LAB039 {


        public static void main(String[] args) {
            // System.out.println(max1020(9,21));
            max1020(30, 16);

        }
        public static void max1020 (int a, int b) {


            if (a >= 10 && a <= 20 && a>b )
            {
                System.out.println(a);
            }

            else if(b >= 10 && b <= 20 && b>a) {
                System.out.println(b);
            }
            else{
                System.out.println(0);

            }
       }

    }

