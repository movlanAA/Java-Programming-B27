package day37_static.car;

public class Street {
    public static void main(String[] args) {

        Car bmw = new Car("X5", "James", 31283284, 'C');
        System.out.println(bmw.driver);
        System.out.println(bmw.driver.name);
        System.out.println(bmw.model); // this is accessing instance variable

    }
}
