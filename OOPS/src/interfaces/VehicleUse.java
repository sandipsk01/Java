package interfaces;
class Vehicle implements VehicleInterface{
	public boolean isMotorized() {
		return false;
	}

	public boolean isMotorized1() {
		return false;
	}	
}
class Vehicle1{
	public void print() {
		System.out.println("Vehicle1");
	}
}

class Car extends Vehicle1 implements VehicleInterface, VehicleInterface2{
	public boolean isMotorized() {    //common method can be used.
		return false;
	}

	public boolean isMotorized1() {
		return false;
	}
	
	public void print() {
//		System.out.println(num);  common var cannot be used.
	}
}
public class VehicleUse {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		System.out.println(v.isMotorized());
	}
}
