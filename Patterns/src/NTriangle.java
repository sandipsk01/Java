import java.util.Scanner;
public class NTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int p=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(p);
				p++;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
