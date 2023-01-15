package day01_practice;


public class DogObjects {
    public static void main(String[] args) {


        Dog dog1=new Dog();
        dog1.name="Lucy";
        dog1.size="Large";
        dog1.breed="Husky";
        dog1.age=6;


        Dog dog2=new Dog();
        dog2.name="Max";
        dog2.size="Small";
        dog2.breed="Rottweiler";
        dog2.age=4;

        System.out.println(dog2);

        System.out.println(dog1);

        dog1.drink();
        dog2.eat();


    }

}
