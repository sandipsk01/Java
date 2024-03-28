package Inheritance;

public class Car extends Vehicle{
	int numofDoors;
	int maxSpeed;
	int tempVar;
	public void printCar() {
		System.out.println("Vehicle Color "+ getColor() +" maxspeed "+ maxSpeed+" num of doors "+numofDoors);
	}
	public void print() {   //function overriding
		super.print();  // Used to call the function/variable from parent class
		System.out.println("Vehicle Color "+ getColor() +" maxspeed "+ maxSpeed+" num of doors "+numofDoors);
	}
	
	public void printMaxSpeed() {
		System.out.println("maxSpeed "+maxSpeed+" super maxSpeed "+super.maxSpeed );//use of super keyword
	}
	
	public Car(int tempVar) {
		super(tempVar);   // this very important when their isn't a default constructor. It will Car constructors parameter value to parent constructors parameter.
		System.out.println("Car Constructor");
	}
	
}
