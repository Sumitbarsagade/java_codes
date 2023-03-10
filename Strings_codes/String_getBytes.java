public class String_getBytes {
    public static void main(String[] args) {
        String s1="Hello World";
        //get Bytes
        byte[] arr=s1.getBytes();
        for (byte b:arr
             ) {
            System.out.println(b);
        }
    }
}
