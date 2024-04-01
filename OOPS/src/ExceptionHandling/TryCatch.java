package ExceptionHandling;

public class TryCatch {
	public static int divide(int a, int b) throws ExceptionName{
		if(b==0) {
			throw new ExceptionName();
		}
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			divide(10,0);
			System.out.println("Within try");
		}catch(ExceptionName e) {
			System.out.println("Exception Handled");
		}catch(Exception e) {
			System.out.println("Generic Exception");
		}finally {
			System.out.println("Finally");
		}
		System.out.println("main");
	}
}
