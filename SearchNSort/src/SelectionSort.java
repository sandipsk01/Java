
public class SelectionSort {

	public static void selectionSort(int[] arr) {
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			int min=arr[i];
			int minIndex=i;
			for(int j=i+1;j<n;j++) {
//				Find min element and it's index
				if(arr[j]<min) {
					min=arr[j];
					minIndex=j;
				}
			}
//			Swap min with i'th element
			int temp=min;
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
	}
	
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,3,6,1,8};
		selectionSort(arr);
		print(arr);
	}

}
