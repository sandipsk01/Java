import java.util.Scanner;

public class MirrorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		int i=1;
		while(i<=n) {
			int spaces=1;
			while(spaces<=n-i) {
				System.out.print(" ");
				spaces++;
			}
			
			int num=1;
			while(num<=i) {
				System.out.print(num);
				num++;
			}
			System.out.println();
			i++;
		}
	}

}
