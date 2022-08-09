package day34_custom_classes;

public class School {
    public static void main(String[] args) {

        Student studentOne = new Student(); // created an object of Student
        System.out.println(studentOne); // print the objects, but we get some hash values

        // instance variables being assigned a value
        studentOne.name = "Olena";
        studentOne.batchNumber = 27;
        studentOne.program = "SDET";
        studentOne.grade = 99.99;

        System.out.println(studentOne); // this still does not show us anything useful

        System.out.println(studentOne.name);
        System.out.println(studentOne.batchNumber);
        System.out.println(studentOne.program);
        System.out.println(studentOne.grade);

        // call in the instance method:
        //Student.study(); this only work if the method was static
        studentOne.study();

        System.out.println("-------------------------");
        Student studentTwo = new Student();
        System.out.println(studentTwo.name);
        System.out.println(studentTwo.batchNumber);
        System.out.println(studentTwo.program);
        System.out.println(studentTwo.grade);

        studentTwo.study();

        /*
        in this case we created a new object of the Student class
        it means this object has a fresh copy of the instance variables, which means they will have their default values
         */



    }
}
