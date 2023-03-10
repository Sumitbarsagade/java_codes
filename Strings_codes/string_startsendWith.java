/*
StartsWith(): it is used to check that string start with given substring or not.
EndsWith(): It is used to check that string end with given substring or not.
 */
public class string_startsendWith {
    public static void main(String[] args) {
        String s1= "Hello World";
        System.out.println(s1.startsWith("H"));

        System.out.println(s1.startsWith("He"));

        System.out.println(s1.startsWith("ll"));

        System.out.println(s1.endsWith("d"));

        System.out.println(s1.endsWith("ld"));
    }

}
