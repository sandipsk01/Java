package Inheritance;

public class Vehicle {
	private String color;
	int maxSpeed;
	int tempVar;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public void print() {
		System.out.println("Vehicle Color "+ color+" maxspeed "+ maxSpeed);
	}
	
	public Vehicle(int tempVar) {
		this.tempVar=tempVar;
		System.out.println("Vehicle Constructor"+this.tempVar);
	}
}
