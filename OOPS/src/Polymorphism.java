class Vehicles{
	String color;
	private int price;
	
	public Vehicles(String color,int price) {
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
class Cars extends Vehicles{
	int doors;
	public Cars(String color,int price, int doors) {
		super(color,price);
		this.doors=doors;
	}
	public void print() {
		System.out.println("Car "+this.color+" "+this.getPrice()+" "+this.doors);
	}
}
public class Polymorphism {
	public static void main(String[] args) {
		Vehicles v=new Cars("Red", 500, 4);
		v.print();   
		//only properties and funcs common in parent can use: bcoz compile time
		// But will execute cars print function 
		// Runtime polymorphism: Bcoz which print function decided at runtime.
	}
}
