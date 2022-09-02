package day42_abstraction.exception_recap;

public class Runner {
    public static void main(String[] args) {
        System.out.println(VendingMachine.select(1)); // this method has an unchecked exception - normally these exceptions are not handled

        // select(2) --> causes the exception

        try{
            System.out.println(VendingMachine.selectValid(5));
        } catch (InvalidSelectionException e){
            System.out.println(e.getMessage());
        }

    }

//    public static void main(String[] args) throws InvalidSelectionException{
//        System.out.println(VendingMachine.selectValid(5));
//    }

    // using throws will allow the program to compile, but you didn't handle the exception, so when we give the invalid data the exception happens and programs stops
}
