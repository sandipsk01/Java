import java.util.Scanner;
public class ArrayBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length of Array:");
		
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter element at "+i+"th index");
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
