package day39_inheritance;

public class Pizza {
    /*
        create a class called Pizza
        - data:
            size (String), number of toppings
    */

    private String size;
    private int numberOfToppings;

    /*
        - constructor
            - create a constructor that creates a Pizza object with the size (String), number of toppings
            	call setters here
    */

    public Pizza(String size, int numberOfToppings){
        setSize(size);
        setNumberOfToppings(numberOfToppings);
    }

    /*
        - encapsulate the Pizza class
        	- setter condition:
        		size can only be:
        			small, medium, or large
        		number of toppings must be a positive number
    */

    public String getSize(){
        return size;
    }

    public void setSize(String size){
        if(size.equals("small") || size.equals("medium") || size.equals("large")){
            this.size = size;
        }
    }

    public int getNumberOfToppings(){
        return numberOfToppings;
    }

    public void setNumberOfToppings(int numberOfToppings){
        if(numberOfToppings >= 0){
            this.numberOfToppings = numberOfToppings;
        }
    }

    /*
        - other methods methods:
            - calculatePrice()
            		calculate the price of the pizza based on:
            			small base: $4
            			medium base: $6
            			large base: $8

            			each topping adds $0.75 to the price

            			calculate the total price and return the cost

            - toString()
                print the size, number of toppings, and cost of the pizza

    Create a separate class to create and test the Pizza objects
     */

    public double calculatePrice(){

        if(size != null){
            return (size.equals("small") ? 4 : size.equals("medium") ? 6 : 8) + numberOfToppings * 0.75;
        }

        return -1; // return -1 if the size was not assigned
    }

    public String toString(){
        return "Size: " + size + ", numberOfToppings: " + numberOfToppings + ", total price: " + calculatePrice();
    }

}
