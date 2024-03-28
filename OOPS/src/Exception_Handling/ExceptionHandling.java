package Exception_Handling;

public class ExceptionHandling {

	public static int fact(int n) throws NegativeNumberException {
		if(n<0) {
			throw new NegativeNumberException();
		}
		int ans=1;
		for(int i=2;i<=n;i++) {
			ans=ans*1;
		}
		return ans;
	}
	public static int divide(int a, int b) throws DivideByZeroException {  // to pass it to main use ( throws exption_name)
		if(b==0) {
			throw new DivideByZeroException();   // to raise an exception object
		}
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {               // to deal with exception use try and catch
			divide(10,0);   // if it fails catch will execute other wise it will continue try. try block must be followed by catch or finally block.
			System.out.println(fact(-1));
			System.out.println("Within Try");
		}catch(DivideByZeroException e){
			System.out.println("Divide by zero exception raised.");
		}catch(NegativeNumberException e) {
			System.out.println("Negative Number exception raised.");
		}catch(Exception e) {
			System.out.println("Generic exception raised.");
		}finally {
			System.out.println("finally");   //bound to execute whatever happen
		}
		
		System.out.println("Main will continue");
	}

}
