class Vehicle{
	String color;
	private int price;
	
	public Vehicle(String color,int price) {
		this.color=color;
		this.price=price;
	}
	public int getPrice() {
		return this.price;
	}
	
	public void print() {
		System.out.println("Vehicle "+this.color+" "+this.price);
	}
}

class Car extends Vehicle{
	int doors;
	public Car(String color,int price, int doors) {
		super(color,price);
		this.doors=doors;
	}
	public void print() {
		System.out.println("CAr "+this.color+" "+this.getPrice()+" "+this.doors);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Vehicle("Red", 500);
		Car c=new Car("Black", 400, 4);
		System.out.println(c.getPrice());
		c.print();
	}

}
