package day40_inheritance.shape;

public class Circle extends Shape{

    double radius;

    public Circle(double radius){
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area(){
        return radius * radius * Math.PI;
    } // Math.pow(radius, 2) * Math.PI;
        // // Math.pow(radius, 2) // radius^2

    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return super.toString() + "\nRadius: " + radius;
    }

}
