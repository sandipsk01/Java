import java.util.Scanner;
public class TakingInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String name = sc.next();
		
		System.out.println("Enter Your Lucky Number: ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Anything: ");
		String comment = sc.nextLine();
		
		System.out.print("Hello "+name+", Your Lucky Number is "+num+". You Comment: "+comment);
	}

}
