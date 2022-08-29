package day41_exceptions.try_catch;

public class FirstTry {
    public static void main(String[] args) {

        try{

            String s = "hello world";
            System.out.println(s.charAt(5));
            System.out.println(s.charAt(1));

        } catch (StringIndexOutOfBoundsException e){
            System.out.println("The String was too short. It went out of bounds");
        } // catch block only runs if an exception happens

    }
}
