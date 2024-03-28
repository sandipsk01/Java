package Interface;
// public class Car extends Vehicle implement Interface2, Interface2   //class can only extend one class but implement more than one
public class Vehicle implements Interfaces{  // to inherit interface use implements

    @Override
    public boolean isMotorized(){
      return false;
    }

    @Override
    public String getCompany(){
      return null;
    }

    void print(){
      System.out.println(PI);
    }

}