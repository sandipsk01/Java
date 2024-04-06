class RegexMatch{
    public static void main(String[] args){
        String str="lmnp";
        boolean result=str.toLowerCase().matches(".*[aeiou].*");
        System.out.print(result);
    }
}