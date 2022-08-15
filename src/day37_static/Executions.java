package day37_static;

public class Executions {

    public static void main(String[] args) {
        new Executions(); // creating object without reference
        System.out.println(1);
        new Executions();
    }

    public Executions(){
        System.out.println(2);
    }

    static { // this block is run first (once), whenever the class is loaded(used)
        System.out.println(3);
    }

}
