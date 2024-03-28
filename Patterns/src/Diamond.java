import java.util.Scanner;
public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i=1;
		int decstar=n;
		while(i<=n/2+1) {
			int spaces=1;
			while(spaces<=n/2+1-i) {
				System.out.print(" ");
				spaces++;
			}
			
			int stars=1;
			while(stars<=2*i-1) {
				System.out.print("*");
				stars++;
			}
			System.out.println();
			i++;
		}
		
		while(i<=n) {
			int spaces=1;
			while(spaces<=i-(n/2+1)) {
				System.out.print(" ");
				spaces++;
			}
			
			int stars=1;
			
			while(stars<=decstar-2) {
				System.out.print("*");
				stars++;
			}
			System.out.println();
			decstar=decstar-2;
			i++;
		}
	}

}
