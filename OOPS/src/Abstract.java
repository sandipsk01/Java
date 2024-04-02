abstract class Vehicle1{
	public abstract boolean isMotorized();
}

class Car1 extends Vehicle1{
	public boolean isMotorized() {
		return true;
	}	
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vehicle v=new Vehicle1(); we cannot do this
		Vehicle1 v=new Car1(); //we are just creating reference of abstract class not object
		Car1 c = new Car1();
		System.out.println(c.isMotorized());
	}

}
