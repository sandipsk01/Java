package constructor_keywords;

public class Student3Use{
    public static void main(String[] args){

        System.out.println(Student3.getNumStudent());

        Student3 s1 = new Student3("Manisha",50);

        Student3 s2= new Student3("Ankush",125);
        Student3 s3= new Student3("Ankush",125);

        System.out.println(Student3.getNumStudent());

    }
}
