import java.util.Scanner;

public class inp_val {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your name and birthday date");
        String b= sc.next();
        int a= sc.nextInt();
        System.out.println("Your name is "+b +" and your birthday date is "+ a);
    }
}
