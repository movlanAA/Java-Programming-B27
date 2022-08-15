package day37_static.car;

import java.util.Scanner;

public class Car {

    String model;
    Driver driver;

    // when I call the Car constructor, the code inside is calling the Diver constructor
    public Car(String model, String name, long licenceNumber, char licenseType){
        this.model = model;
        driver = new Driver(name, licenceNumber, licenseType); // creating a Driver object
    }

    public Car(String model, Driver driver){
        this.model = model;
        this.driver = driver;
    }


}
