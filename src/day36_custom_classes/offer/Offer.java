package day36_custom_classes.offer;

public class Offer {
    /*
       create a class called Offer

        - data:

            company, location, salary, is full time, number of PTO
    */

    String company;
    String location;
    double salary;
    boolean isFullTime;
    int numberOfPto;

    /*
        - constructor

            - create a constructor that creates an Offer object with the company and location

            - create a constructor that creates an Offer object with the company, location, and salary

            - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO

*/

    public Offer(String company, String location) {
        this.company = company;
        this.location = location;
    }

    public Offer(String company, String location, double salary) {
        this(company, location);
        this.salary = salary;
    }

    public Offer(String company, String location, double salary, boolean isFullTime, int numberOfPto) {
        this(company, location, salary);
        this.isFullTime = isFullTime;
        this.numberOfPto = numberOfPto;
    }
    /*
        - method:

            toString()
                print all the employees information
    */

    @Override
    public String toString() {
        return "\nOffer{" +
                "company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", numberOfPto=" + numberOfPto +
                '}';
    }
}
