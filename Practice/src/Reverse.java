class Reverse{
    public static void main(String[] args){
        String s="Sandip";
        char[] arr=s.toCharArray();
        StringBuilder rev=new StringBuilder();

        for(int i=arr.length-1;i>=0;i--){
            rev.append(arr[i]);
        }
        
        System.out.print(rev);
    }
}