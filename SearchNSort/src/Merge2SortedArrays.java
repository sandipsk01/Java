
public class Merge2SortedArrays {
	
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] merge2SortedArrays(int[] arr1, int[] arr2) {
		int m=arr1.length;
		int n=arr2.length;
		int[] arr3=new int[m+n];
		int i=0;
		int j=0;
		int k=0;
		while(i<m && j<n) {
			if(arr1[i]<=arr2[j]) {
				arr3[k]=arr1[i];
				i++;
				k++;
			}else {
				arr3[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<m) {
			arr3[k]=arr1[i];
			i++;
			k++;
		}
		while(j<n) {
			arr3[k]=arr2[j];
			j++;
			k++;
		}
		return arr3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {2,3,6,8,9};
		int[] arr2= {5,6,7,10};
		int arr3[]=merge2SortedArrays(arr1, arr2);
		print(arr3);

	}

}
