import java.util.Scanner;
public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		
		String result = num % 2 == 1 ? "Value entered is odd" :"Value entered is even";
		
		System.out.print(result);

	}

}
