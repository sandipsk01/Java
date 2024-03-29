
public class ArrWithFunc {
	public static void print(int[] input) {
		for(int i=0; i<input.length;i++) {
			System.out.println(input[i]);
		}
	}

	public static void increment(int[] input) {
		for(int i=0; i<input.length;i++) {
			input[i]++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		increment(arr);
		print(arr);
	}

}
// will print update values bcoz of arr=referene.