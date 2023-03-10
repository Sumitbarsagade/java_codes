public class String_equals {
    public static void main(String[] args) {
        String s1="Hello";
        String  s2="Hello";
        if(s1==s2){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        //In this case the output is equal because both are pointing the same reference
        //Don't use comparison operator instead of it use equals function in java
        if(s1.equals(s2)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }


    }
}
