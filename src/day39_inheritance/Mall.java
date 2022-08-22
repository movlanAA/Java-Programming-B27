package day39_inheritance;

public class Mall {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("medium", 2);
        System.out.println(pizza1);

        Pizza pizza2 = new Pizza("large", -3);
        System.out.println(pizza2.getSize());
        System.out.println(pizza2.getNumberOfToppings());

        Pizza pizza3 = new Pizza("extra large", 3);
        System.out.println(pizza3.getSize());
        System.out.println(pizza3.getNumberOfToppings());

        pizza3.setSize("large");
        System.out.println(pizza3.getSize());

        Pizza[] pizzas = {pizza1, pizza2, pizza3};

        for(Pizza each : pizzas){
            System.out.println(each.getSize());
        }

    }
}
