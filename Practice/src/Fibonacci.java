class Fibonacci{
    public static void withoutRec(int count){
        int a=0;
        int b=1;
        int c=1;
        
        for(int i=1;i<=count;i++){
            System.out.print(a+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
    
    public static int withRec(int count){
        if(count <=1){
            return count;
        }
        
        return withRec(count-1)+withRec(count-2);
    }
    
    public static void main(String[] args){
        int length=10;
        
        withoutRec(length);
        
        System.out.println();
        
        for(int i=0;i<length;i++){
            System.out.print(withRec(i)+" ");
        }
    }
}