import java.util.Scanner;
public class ForLoop2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1,j=2; i<=n && j<=200; i++, j+=2) {
			System.out.println(i+" "+j);
		}
	}
}
