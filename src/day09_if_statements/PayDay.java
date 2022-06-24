package day09_if_statements;

public class PayDay {
    public static void main(String[] args) {

        double hourlyRate = 60;
        int hoursPerWeek = 52;
        double netPay;

        if(hoursPerWeek > 40){
            // overtime calculation

            int overtimeHours = hoursPerWeek - 40;
            netPay = hourlyRate * 40; // calculate the normal pay for a 40 hour week
            netPay += hourlyRate * overtimeHours * 1.5; // total earned from overtime
            // netPay = netPay +  hourlyRate * overtimeHours * 1.5;

        } else {
            // worked under or equal 40 hours, so no overtime

            netPay = hourlyRate * hoursPerWeek;

        }

        System.out.println("Net pay: " + netPay);

    }
}
