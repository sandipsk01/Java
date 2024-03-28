import java.util.Scanner;
import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any natural Number: ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i<=n; i++) {
			sum = sum + i;
			
		}
		
		System.out.print(sum);
	}

}
