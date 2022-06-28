package day11_nested;

public class NestedExample {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        if(a){
            System.out.println(1);

            if(b){
                System.out.println(2);
            }

        }

        /*
        when
            a = true
            b = true
            output:
                1
                2
        when
            a = false
            b = true
            output:
                no output

        when
            a = true
            b = false
            output:
                1

         */



    }
}
