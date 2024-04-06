class Swap{
    public static void main(String[] args){
        int a=3,b=5;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print(a+" "+b);
    }
}