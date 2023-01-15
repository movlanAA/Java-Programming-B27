package day01_practice;

public class Dog {
    public String name;
    public String size;
    public String breed;
    public int age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat(){
        System.out.println(name+" is eating meat");
    }
    public void drink() {
        System.out.println(name + " is drinking water");

    }
    }

