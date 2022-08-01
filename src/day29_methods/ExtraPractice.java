package day29_methods;

public class ExtraPractice {

    public static void main(String[] args) {
        int[] nums = {1, 24, 5, 12};
        System.out.println(sumFromArray(nums)); // int sum = sumFromArray(nums);

        System.out.println(currencyConverter("yen", 100));
        System.out.println(currencyConverter("won", 100));
        System.out.println(currencyConverter("EURO", 100));
        System.out.println(currencyConverter("peso", 100));

        String name = "lira";
        double price = 800;

        System.out.println(currencyConverter(name, price));

    }

    /*
    Create a method that accept an int array. Take the sum of all the numbers and return the sum
     */
    public static int sumFromArray(int[] nums) {
        int sum = 0;
        for (int eachNum : nums) {
            sum += eachNum;
        }
        return sum;
    }

    /*

Currency Converter

    create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type

    Use the following information to convert from given dollars to the desired currency type

    1 dollar = 0.91 euro
    1 dollar = 121.03 yen
    1 dollar = 14.85 lira
    1 dollar = 1,217.52 won
    1 dollar = 181.45 rupee

    Note: Don't worry about decimal formats, focus on method

    Ex:
        Input:
            euro, 100

        Output:
            91

    Ex:
        Input:
            yen, 50

        Output:
            6051.5
    ________________________
     */

    public static double currencyConverter(String type, double dollar) {
        double converted = 0.0;
        switch (type.toLowerCase()) {
            case "euro":
                converted = dollar * 0.91;
                break;
            case "yen":
                converted = dollar * 121.03;
                break;
            case "lira":
                converted = dollar * 14.85;
                break;
            case "won":
                converted = dollar * 1_217.52;
                break;
            case "rupee":
                converted = dollar * 181.45;
                break;
            default:
                System.out.println("We cannot convert to " + type);
        }
        return converted;
    }

        // alternative with return each case:
//    public static double currencyConverter(String type, double dollar) {
//        switch (type.toLowerCase()) {
//            case "euro":
//                return dollar * 0.91;
//            case "yen":
//                return dollar * 121.03;
//            case "lira":
//                return dollar * 14.85;
//            case "won":
//                return dollar * 1_217.52;
//            case "rupee":
//                return dollar * 181.45;
//            default:
//                System.out.println("We cannot convert to " + type);
//                return 0.0;
//        }
//
//    }

}
