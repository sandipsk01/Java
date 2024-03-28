import java.util.Scanner;
public class Largest {
	
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array:");
		
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter element at "+i+"th index");
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	public static int largest(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=takeInput();
		int lar=largest(arr);
		System.out.println(lar);
	}

}
