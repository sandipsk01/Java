
public class Constructor {
	
	String modelName;
	int launchYear;
	
	Constructor(String name, int year){
		modelName=name;
		launchYear=year;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj = new Constructor("BMW",1995);
		
		System.out.print(obj.modelName);
		
	}

}
