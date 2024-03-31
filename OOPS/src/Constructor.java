class Students{
	String name;
	private int rollNo;
	final static char division='A';
	public Students(String name, int rollNo) {      //Constructor
		this.name=name;
		this.rollNo=rollNo;
	}
	
	public Students(String name) {     //Another cont. to give freedom of not passing rollNo
		this.name=name;
		this.rollNo=7;
	}
	
	public int getRollNo() {
		return this.rollNo;
	}	
	
	public void setRollNo(int rollNo) {
		if(rollNo<=0) {
			return;
		}
		this.rollNo=rollNo;   //this=objName(address)
	}
}
public class Constructor {
	public static void main(String[] args) {
		Students s1=new Students("Sandip",7);
		Students s2=new Students("Sumit");
		
		System.out.println(s1.name+" "+s1.getRollNo());
		System.out.println(s2.name+" "+s2.getRollNo());
	}
}
