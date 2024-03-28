package generics;

public class BoundedGeneric{

    public static<T extends PrintInterface> void printArray(T arr[]){
        for(int i=0;i<arr.length;i++){
          arr[i].print();
//        System.out.println(arr[i]);
        }
    }

   
    public static void main(String[]args){
      Vehicle v[] = new Vehicle[5];
      for(int i=0;i<v.length;i++){
        v[i]= new Vehicle(i,"ab");
      }
      printArray(v);

    }
}