package Inheritance;

public class VehicleUse {
	public static void main(String[]args) {
		Vehicle v=new Vehicle(100);
		Car c= new Car(10);  // parent constructor will get called first when we call child constructor
		// v.color="red";
		v.setColor("red");
		v.maxSpeed=10;
		v.print();
		
		
		//c.color="green";
		c.setColor("green");
		c.maxSpeed=50;
		c.numofDoors=4;
		c.print();
		c.printCar();
		c.printMaxSpeed();
	}
}
