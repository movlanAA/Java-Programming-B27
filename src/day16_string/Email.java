package day16_string;

public class Email {
    public static void main(String[] args) {

        /*

            saim@cydeo.com

            name -> saim
            domain -> cydeo

         */

        String email = "bruce@wayneeterprise.net";
        int indexOfAt = email.indexOf('@');
        String name = email.substring(0, indexOfAt);
        int indexOfDot = email.indexOf('.');
        String domain = email.substring(indexOfAt + 1, indexOfDot);

        System.out.println("Full Email: " + email);
        System.out.println("Name part: " + name);
        System.out.println("Domain part: " + domain);


    }
}
