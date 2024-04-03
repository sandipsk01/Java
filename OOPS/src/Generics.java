class Pair<T,S>{
	public T var1;
	public S var2;
	public Pair(T var1, S var2) {
		this.var1=var1;
		this.var2=var2;
	}
	
	public void print() {
		System.out.println(this.var1+" "+var2);
	}
}
public class Generics {
//	Generic Method
	public static<A> void printArray(A arr[]){
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String, Integer> ref1=new Pair<String, Integer>("Sandip",7);
		ref1.print();
		
//		Pair<int> ref2=new Pair<int>(7);  cannot use primitive data type
		Pair<Integer, String> ref2=new Pair<Integer,String>(7,"SANDIP");   //but can use wrapper classes
		ref2.print();
		
//		Chained Generics
		Pair<Pair<String, Integer>,String> pRef=new Pair<>(new Pair<>("Sandip",7),"abcd");
		pRef.print();
		System.out.println(pRef.var1.var1);
		
//		Generic Method
		Integer arr[] = {1,2,3,4};
		printArray(arr);
	}

}
