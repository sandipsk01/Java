package generics;

public class MultipleGenericUse {
	public static void main(String[] args){

		MultipleGeneric<String, Integer> pInner= new MultipleGeneric<String, Integer>("ab",10);
		
		//Chained Generic
		MultipleGeneric< MultipleGeneric<String, Integer>,String > p= new MultipleGeneric<>();
		p.setFirst(pInner);
		System.out.print(p.getFirst());
		System.out.println(p.getFirst().getFirst());
		System.out.println(p.getFirst().getSecond());
	}
}
