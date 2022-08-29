package day41_exceptions.season;

public class Season {

    String name;
    double highestTemp;
    double lowestTemp;

    public Season(String name, double highestTemp, double lowestTemp) {
        this.name = name;
        this.highestTemp = highestTemp;
        this.lowestTemp = lowestTemp;
    }

    public void activity(){
        System.out.println("GENERIC SEASON");
    }

    public String toString(){
        return name + " season with the highest temperature of " + highestTemp + " and a lowest temperature of " + lowestTemp;
    }
}

/*
Create a class Season

	instance variables
		- name (String)
		- highest average temperature
		- lowest average temperature

	constructor:
		- initialize all fields

	methods:
		- activity(), toString()

		override activity in sub classes

Create a class Winter

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Print Use Fireplace

Create a class Summer

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Drink Lemonade

Create a class Fall

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Read A Book

Create a class Spring

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Go Outside

Create a class CheckSeason

	create an object of Winter, Summer, Fall and Spring and verify if constructor, toString(), and activity() are working properly for each class

	List the is a relations of all the classes

--------------------------------------------------------

Create a class OlympicSport

	instance variables
		- name (String)
		- participants (int)

	constructor:
		- initialize all fields

	methods:
		- compete(), toString()

		override compete in sub classes
 */