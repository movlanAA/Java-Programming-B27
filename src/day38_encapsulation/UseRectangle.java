package day38_encapsulation;

public class UseRectangle {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
//        rectangle1.length = 10;
//        rectangle1.width = 5;
        // direct access to the variable to assign is not possible because they have private access modifier
        // use setter methods to assign
        rectangle1.setLength(10);
        rectangle1.setWidth(5);

//        System.out.println(rectangle1.length);
//        System.out.println(rectangle1.width);
        // use getter methods to read/use the value
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());
    }
}
