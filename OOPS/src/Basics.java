class Student{
	String name;
	private int rollNo;
	
//	Getter: To access private prop
	public int getRollNo() {
		return this.rollNo;
	}
	
//	Setter: To modify
	public void setRollNo(int rollNo) {
		if(rollNo<=0) {
			return;
		}
		this.rollNo=rollNo;   //this=objName(address)
	}
}

public class Basics {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		
		s1.name="Sandip";
		s2.setRollNo(7);
		
		System.out.println(s1.name+" "+s1.getRollNo());
		System.out.println(s2.name+" "+s2.getRollNo());
	}
}
