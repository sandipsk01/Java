package constructor_keywords;
public class Student3{
    public String name;
    final private int rollNumber;
    double cgpa;
    final double converisonFactor= 0.95;
    static private int numStudents;

    public Student3(String name, int rollNumber){
      this.name=name;
      this.rollNumber= rollNumber;
      numStudents++;
    }

    public static int getNumStudent() {
    	return numStudents;
    }
    public void print(){
      System.out.println(name+" "+rollNumber);
    }
}