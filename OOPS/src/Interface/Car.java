package Interface;

public class Car extends Vehicle implements Interfaces, CarInterface{

    @Override
    public boolean isMotorized(){
      return true;
    }

    @Override
    public String getCompany(){
      return null;
     }

     @Override
     public int numGears(){
       return 5;
      }
     // Two interfaces can have same method but can not have same variable while implementing by same class
//      void print(){
//          System.out.println(PI);
//      }
}
