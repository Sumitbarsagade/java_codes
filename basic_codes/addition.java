import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        a= sc.nextInt();
        b= sc.nextInt();
        c=a+b;
        System.out.println("The sum of two numbers"+c);
    }
}
