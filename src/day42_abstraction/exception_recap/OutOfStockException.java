package day42_abstraction.exception_recap;

public class OutOfStockException extends RuntimeException{ // being a child of RunTimException means we created an unchecked exception

    public OutOfStockException(){
        super("Item is out of stock"); // this helps us define the message of the exception
    }
}
