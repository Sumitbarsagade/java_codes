public class stringBuffer_method {

    public static void main(String[] args) {
         /*
    When we object stringBuffer means we are creating variables string. We are creating variables string.
    We can change the content of string buffer object during runtime.

    When we create StringBuffer by default its capacity is 16 bytes. During ruin time capacity can be
    change.
     */
        //Methods:

        StringBuffer sb =new StringBuffer("Hello World");
        //Capacity: This method give the capacity of string buffer object
        System.out.println(sb.capacity());

        //getLength of StringBuffer
        System.out.println(sb.length());

        //append: Append dta to the end of String Buffer object
        System.out.println(sb);
        sb.append(" hi");
        System.out.println(sb);

        //delete
        System.out.println(sb.delete(11,14));

        //reverse
        System.out.println(sb.reverse());

        StringBuffer sb1 = new StringBuffer("I JAVA");
        System.out.println(sb1);
        sb1.insert(2, "LIKE");

        //covert StringBuffer object to string
        String s4= sb1.toString();
        System.out.println(s4);

        //setCharAt
        System.out.println(sb1);
        sb1.setCharAt(0, 'i');
        System.out.println(sb1);





    }


}
