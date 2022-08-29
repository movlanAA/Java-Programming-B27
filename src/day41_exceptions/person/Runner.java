package day41_exceptions.person;

public class Runner {
    public static void main(String[] args) {

        Person obj = new Person();
        obj.setName("James");
        obj.setAge(21);
        System.out.println(obj);

        Person obj2 = new Person();
        obj2.setAge(-30);
        System.out.println(obj2);

    }
}
