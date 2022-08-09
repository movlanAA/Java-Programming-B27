package day34_custom_classes;

public class App {

    String name;
    double version;
    boolean isFree;
    int ratings;

    public void update(){
        System.out.println(name + " is updating");
        version += 0.1;
    }

    public String toString(){
        return "Name: " + name +"\nVersion: " + version +"\nis Free: " + isFree + "\nRatings:" + ratings;
    }

}
