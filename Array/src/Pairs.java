
public class Pairs {

	public static void printPairs(int[] input) {
		for(int i=0;i<input.length-1;i++) {
			for(int j=i+1;j<input.length;j++) {
				System.out.print("{"+input[i]+","+input[j]+"}, ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,7,6,5};
		printPairs(arr);
	}

}
