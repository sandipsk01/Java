package Polymorphism;
import java.util.Scanner;
public class VehicleUse{

    public static void main(String[] args){

	    //Vehicle v= new Car(4, 100);
	    //v.maxSpeed= 100;
	    // v.numDoors= 4;  // can only access property which are common in parent and child

	    Vehicle v1;
	    Scanner s= new Scanner(System.in);
	    int n= s.nextInt();
	    if(n<10){
	    	v1= new Car(4, 100);
	    }else{
	    	v1= new Vehicle(40);
	    }

    //  Car c= new Vehicle();  **It is not possible to create object of parent class using its child class constructor reference.

	  //Car c= (Car) v;   // can access every property of child using type cast.
	  //c.numDoors=3;
	    
	   // Note : "Object" class is the super class of any class in java.
    }
}