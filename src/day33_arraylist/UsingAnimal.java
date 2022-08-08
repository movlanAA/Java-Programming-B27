package day33_arraylist;

public class UsingAnimal {
    public static void main(String[] args) {

        Animal animal1 = new Animal(); // creating an object of the Animal class
        animal1.species = "Lions";
        animal1.numberOfLegs = 4;
        animal1.age = 15;
        animal1.canFly = false;
        animal1.weight = 200;

        System.out.println(animal1.species);
        System.out.println(animal1.numberOfLegs);
        System.out.println(animal1.age);
        System.out.println(animal1.canFly);
        System.out.println(animal1.weight);

        Animal animal2 = new Animal();
        System.out.println(animal2.species);


    }
}
