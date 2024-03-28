
public class PassBy {
	
	static int changeValue(int a) {
		a*=100;
		System.out.println("Inside change func: "+a);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		System.out.println("Before change func: "+a);
		
		changeValue(a); // passing by value
		System.out.println("After change func: "+a);
	}

}
