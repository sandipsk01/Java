import java.util.Scanner;
class Algebra{
	
	public int sum(int a, int b) {
		return a+b;
	}
}
public class CallingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int x=sc.nextInt();
		
		System.out.print("Enter second number: ");
		int y=sc.nextInt();
		
		Algebra obj = new Algebra();
		
		int ans=obj.sum(x, y);
		
		System.out.print("Sum of given numbers:4 ");
		System.out.print(ans);
		
		}

}
