import java.util.Scanner;
public class NumIsoscles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i=1;
		while(i<=n) {
			int spaces=1;
			while(spaces<=n-i) {
				System.out.print(" ");
				spaces++;
			}
			
			int num=1;
			int p=i;
			while(num<=i) {
				System.out.print(p);
				p++;
				num++;
			}
			
			p=p-2;
			int dec=i-1;
			while(dec>=1) {
				System.out.print(p);
				p--;
				dec--;
			}
			
			System.out.println();
			i++;
		}
	}

}
