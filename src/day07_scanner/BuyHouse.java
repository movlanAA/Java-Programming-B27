package day07_scanner;

public class BuyHouse {
    /*

create a class BuyHouse

    declare and assign a credit score variable
    declare and assign a salary

    determine if you can get a loan to buy a house
    there is two ways to get a loan:
        credit score of 720 or above and salary of 100,000 or above
        credit score of 740 or above and salary of 80,000 or above
     */
    public static void main(String[] args) {

        int creditScore = 720;
        int salary = 120_000;

        boolean option1 = creditScore >= 720 && salary >= 100_000;
        boolean option2 = creditScore >= 740 && salary >= 80_000;

        boolean canGetLoan = option1 || option2;
        System.out.println(canGetLoan);


    }
}
