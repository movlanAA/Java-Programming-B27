package day43_abstraction.cars;

public class Toyota extends Car{

    @Override
    public void start() {
        System.out.println("turning the key to start");
    }

//    public void start(int a){
//          can you overload ? yes
//    }
}
