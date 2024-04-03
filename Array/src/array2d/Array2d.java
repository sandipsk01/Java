package array2d;
import java.util.Scanner;
public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		
		int[][] arr2d=new int[rows][cols];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr2d[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
