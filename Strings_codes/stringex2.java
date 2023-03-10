public class stringex2 {
    public static void main(String[] args) {
        String s1="Hello World";
        int x=s1.length();
        System.out.println(x);

        //CharAt
        char ch= s1.charAt(0);
        System.out.println(ch);

        //toCHarArray
        char arr[]=s1.toCharArray();
        for(int i=0; i<s1.length(); i++){
            System.out.println(arr[i]);
        }
        for (char a:arr) {
            System.out.println(a);
        }
    }
}
