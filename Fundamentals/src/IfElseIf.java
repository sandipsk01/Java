import java.util.Scanner;
public class IfElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Score: ");
		int score= sc.nextInt();
		
		if(score > 80)
		{
		System.out.println("You have passes with Grade A");
		} else if (score > 60)
		{
		System.out.println("You have passes with Grade B");
		} else if (score > 40)
		{
		System.out.println("You have passes with Grade C");
		} else
		{
		System.out.println("You have passes with Grade D");
		}

	}

}
