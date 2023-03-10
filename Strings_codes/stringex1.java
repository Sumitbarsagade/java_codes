public class stringex1 {
    public static void main(String[] args) {
        String s1="ABCD";
        //Create string object by char arroy
        System.out.println(s1);
        char arr[]={'a','b','c','d'};
        String s2=new String(arr);
        System.out.println(s2);

        //Create a string by byte array
        byte arr1[]={9,7,4,3,5,3};
        String s3=new String(arr1);

        System.out.println(s3);
    }

}
