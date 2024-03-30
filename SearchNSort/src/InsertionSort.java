
public class InsertionSort {
	
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void insertionSort(int[] arr) {
		int n=arr.length;
		
		for(int i=1;i<n;i++) {
//			Insert the ith element in sorted portion
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && temp<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
//			Place at position bcoz of above j--
			arr[j+1]=temp; 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,3,6,9,1,8};
		insertionSort(arr);
		print(arr);
	}

}
