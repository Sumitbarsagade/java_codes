public class string_equal2 {
    public static void main(String[] args) {
        String s1="Hello";
        System.out.println(s1);
        String s2="hello";
        s1="Hey";
        System.out.println(s1);
        if(s1.equals(s2)){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }

        //by using equalIgnoreCase
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }

    }
}
