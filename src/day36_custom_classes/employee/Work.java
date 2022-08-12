package day36_custom_classes.employee;

public class Work {
    public static void main(String[] args) {

        Employee james = new Employee("James Bond", 7, "Spy", 10_000_000);
        james.goToMeeting();
        System.out.println(james);

    }
}
