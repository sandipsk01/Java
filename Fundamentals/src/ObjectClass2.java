class Demo {
	String name="Sumit";
    int rollno;
}

public class ObjectClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj1 = new Demo();

        obj1.name = "Sandip";
        obj1.rollno = 8;

        System.out.println("Hello " + obj1.name + ", Your roll number is " + obj1.rollno +".");

	}

}
