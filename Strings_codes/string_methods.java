

public class string_methods {
    public static void main(String[] args) {
        // substring: It is used to extract part of original string between start and end index
        String s1="Hello world";
        String s2= s1.substring(2,7);
        System.out.println(s2);

        // Concede: It is used to join two string object
        String s3="Hey ";
        String s4="Harry";
        String s5=s3+s4;
        System.out.println(s5);

        //Replace: It is used to replace old substring with given substring
        String s6="Hello World";
        String s7=s6.replace("H","h");
        System.out.println(s7);

        //Trim: Cut starting and ending spaces.
        String s8="Hello";
        String s9="Hello ";

        if(s8.equals(s9.trim()))
        {
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }

        //toUpperCase: Convert string into UpperCase
        System.out.println(s8.toUpperCase());


        //toLowerCase: Convert string into lowercase
        System.out.println(s9.toLowerCase());

        //Split: It is used to divide a string by giving separate character
        String s10 = "This is demo string";
        String[] arr= s10.split(" ");
        for(String n: arr){
            System.out.println(n);
        }


    }
}
