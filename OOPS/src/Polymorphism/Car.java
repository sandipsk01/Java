package Polymorphism;

public class Car extends Vehicle{

    int numDoors;
    int maxSpeed;

    public Car(int numDoors,int maxSpeed){
    	super(maxSpeed);    // to call call parent class constructor and assign val.
    	System.out.println("Car's Constructor");
    	this.numDoors = numDoors;
    }

    public void print(){
        super.print();
        System.out.println("Car "+ " numdoors "+ numDoors);
    }

    public void printMaxspeed(){
        super.maxSpeed = 15;
        System.out.println(maxSpeed+ " " + super.maxSpeed);
    }
}