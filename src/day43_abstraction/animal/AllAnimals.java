package day43_abstraction.animal;

public class AllAnimals {

}

class Cat extends Animal implements Friendly{
    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public String toString() {
        return "Cat{}";
    }

    public Cat() {
    }

    @Override
    public void pet() {

    }

    @Override
    public void play() {

    }
}

class Tiger extends Animal implements Swimable {
    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void swim() {

    }
}
class Shark extends Animal implements Swimable {
    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void swim() {

    }
}
class Bird extends Animal implements Flyable{
    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void fly() {

    }
}
class Duck extends Animal implements Flyable, Swimable{
    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}